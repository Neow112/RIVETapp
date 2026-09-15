# Точная инструкция: как получить APK

## 1. Репозиторий
Создайте новый репозиторий GitHub, например `RIVET-Android`.

## 2. Файлы
Распакуйте архив и загрузите в корень репозитория папки и файлы:

- `.github/`
- `app/`
- `gradle/`
- `handoff/`
- `scripts/`
- `build.gradle.kts`
- `settings.gradle.kts`
- `gradle.properties`
- `README.md`

Критично: `app/` должен лежать прямо в корне. Нельзя получить структуру `RIVET_GITHUB_ACTIONS_APK_v1/RIVET_GITHUB_ACTIONS_APK_v1/app`.

## 3. Запуск
Откройте GitHub → ваш репозиторий → **Actions** → **Build RIVET APK** → **Run workflow**.

## 4. Где APK
После завершения job внизу страницы появится **Artifacts** → `RIVET-debug-apk-N`.
Скачайте ZIP artifact и распакуйте `RIVET-debug.apk`.

## 5. Что делает CI
CI ставит JDK 17, Android SDK 37, Build Tools 36.0.0 и Gradle 9.6.0, генерирует стандартный Gradle Wrapper прямо на runner, проверяет проект и выполняет `:app:assembleDebug`.

## 6. Почему сборка не стартует сама
В workflow оставлен только `workflow_dispatch`. Триггеров `push` и `pull_request` нет.
