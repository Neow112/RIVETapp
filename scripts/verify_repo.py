#!/usr/bin/env python3
from pathlib import Path
import sys
import xml.etree.ElementTree as ET

ROOT = Path(__file__).resolve().parents[1]
required = [
    'settings.gradle.kts',
    'build.gradle.kts',
    'gradle.properties',
    'gradle/libs.versions.toml',
    'app/build.gradle.kts',
    'app/src/main/AndroidManifest.xml',
    'app/src/main/java/kz/rivet/app/MainActivity.kt',
    '.github/workflows/build-apk.yml',
]
missing = [p for p in required if not (ROOT/p).exists()]
if missing:
    print('ERROR: Missing required project files:')
    for p in missing: print(' -', p)
    sys.exit(1)

# XML well-formedness check
xml_files = list((ROOT/'app/src/main/res').rglob('*.xml')) + [ROOT/'app/src/main/AndroidManifest.xml']
for f in xml_files:
    try:
        ET.parse(f)
    except Exception as exc:
        print(f'ERROR: invalid XML: {f.relative_to(ROOT)}: {exc}')
        sys.exit(2)

# Android resource naming
for f in (ROOT/'app/src/main/res').rglob('*'):
    if f.is_file() and f.parent.name not in {'values','values-night'}:
        stem=f.stem
        if not stem.replace('_','').isalnum() or any(c.isupper() for c in stem) or '-' in stem:
            print(f'ERROR: invalid Android resource filename: {f.relative_to(ROOT)}')
            sys.exit(3)

print(f'OK: repository structure present; {len(xml_files)} XML files parsed successfully.')
