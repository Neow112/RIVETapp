# RIVET — Android / GitHub Actions APK starter

Это **канонический корень Android-проекта RIVET** для поэтапной разработки.
Сейчас APK содержит developer-каталог базовой дизайн-системы. 33 финальных экрана ещё не реализованы кодом — их эталоны и контракты находятся в `handoff/` и должны добавляться поэтапно.

## Сборка APK в GitHub Actions

1. Распакуйте ZIP.
2. Создайте новый пустой GitHub-репозиторий.
3. Загрузите **содержимое этой папки в корень репозитория**. Не загружайте ZIP как единственный файл.
4. Проверьте, что в репозитории существует `.github/workflows/build-apk.yml`.
5. Откройте вкладку **Actions**.
6. Выберите **Build RIVET APK**.
7. Нажмите **Run workflow** → **Run workflow**.
8. После зелёной сборки откройте run и скачайте artifact `RIVET-debug-apk-...`.
9. В artifact будет `RIVET-debug.apk` и SHA-256 checksum.

### Важно
Workflow запускается **только вручную** (`workflow_dispatch`). Обычная загрузка файлов, commit или push APK автоматически не собирают.

## Toolchain
- Android Gradle Plugin: 9.4.0
- Gradle: 9.6.0
- JDK: 17
- compileSdk: 37
- targetSdk: 36
- minSdk: 26
- Compose BOM: 2026.08.00
- Activity Compose: 1.13.0
- Kotlin / Compose Compiler plugin: 2.3.21

## Структура
- `app/` — Android application module
- `gradle/` — version catalog / wrapper configuration
- `.github/workflows/build-apk.yml` — ручная CI-сборка APK
- `scripts/verify_repo.py` — предварительная проверка структуры и XML
- `handoff/` — макеты, ассеты, screen contracts, спецификации и QA из developer handoff v4

## Что уже работает в APK
Developer build показывает базовую RIVET дизайн-систему: типографику, кнопки, поле ввода, status chips, карточку и responsive width class. Это стартовая сборка для следующего этапа — реализации экранов по контрактам.

## Шрифты
Проект сейчас build-safe и использует `FontFamily.SansSerif`. Эталонный шрифт интерфейса — Inter. Инструкция и installer из handoff сохранены в `handoff/`. Не добавляйте случайные файлы шрифта без проверки лицензии и точного веса.
