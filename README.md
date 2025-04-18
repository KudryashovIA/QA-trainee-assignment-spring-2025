# Проект QA-trainee-assignment-spring-2025

Привет! Меня зовут Иван. 

В этом репозитории находится тестовое задание для отбора на стражировку в Авито по направлению QA-инженер.

Ссылка на задание: [QA-trainee-assignment-spring-2025](https://github.com/avito-tech/tech-internship/blob/main/Tech%20Internships/QA/QA-trainee-assignment-spring-2025/QA-trainee-assignment-spring-2025.md)

# Структура проекта:
Файл для задания 1
 - [TASK_1.md](./TASK_1.md) - решение задания 1

Файлы для задания 2
 - [QA_trainee](./QA_trainee) - проект с автотестами на языке java
 - [TESTCASES.md](./TESTCASES.md) - список тест-кейсов для проверки пользовательских сценариев  
 - [BUGS.md](./BUGS.md) - список с найденными во время выполнения задания багами 

---
## Задание 1

В данном задании нужно проанализировать скриншот страницы Авито с результатами поиска и:

1. перечислить все имеющиеся баги
2. указать их приоритет (high, medium, low)

## Задание 2

### Условие
На [сайте](https://makarovartem.github.io/frontend-avito-tech-test-assignment) размещён сборник игр по разным жанрам. Внутри платформы доступны функции поиска по всему каталогу, жанру и сортировка.  Также есть возможность провалиться в карточку игры.

### Суть задания:
1. Составьте тест-кейсы на пользовательские сценарии из списка ниже:
* Открытие карточки игры
* Отображение разного количества карточек игр на странице поиска
* Переход по страницам результата поиска с помощью пагинации
2. Автоматизируйте тест-кейсы:
* В автоматизированных тест кейсах нужно проверять результат
3. Запустите автоматизированные тесты:
* Все тесты должны быть пройдены

### Нефункциональные требования:
* Оформите решение в файле TESTCASES.md
* Задание можно выполнить на любом языке (предпочтительным будет JavaScript или TypeScript), фреймворке, драйвере;
* Оформите инструкцию в файле README.md
* Если в результате тестирования найдены баги, то составьте баг-репорт в файле BUGS.md
---

## Инструкция по запуску автотестов для задания 2 

##  Шаг 1. Установите Java JDK

1. Перейдите на официальный сайт: [https://adoptium.net/temurin/releases/?version=17](https://adoptium.net/temurin/releases/?version=17)
2. Скачайте и установите **Temurin 17 (LTS)**.
3. После установки, откройте терминал/командную строку и проверьте установку:

```bash
java -version
```

Должно отобразиться что-то вроде:

```
openjdk version "17.x.x" 202x-xx-xx
```

---

## Шаг 2. Установите Apache Maven

1. Скачайте последнюю версию Maven: [https://maven.apache.org/download.cgi](https://maven.apache.org/download.cgi)
2. Распакуйте архив (например, в `C:\Tools\apache-maven-<version>`)
3. Добавьте Maven в переменные среды (Windows):
   - Переменная `MAVEN_HOME` → путь до папки Maven
   - В `Path` добавьте: `%MAVEN_HOME%\bin`

4. Проверьте установку:

```bash
mvn -v
```

Вывод должен содержать версию Maven и Java.

---

## Шаг 3. Установите Google Chrome

1. Скачайте и установите браузер [Google Chrome](https://www.google.com/chrome/)
2. После установки проверьте версию браузера (Настройки → О Chrome)
3. Скачайте соответствующий ChromeDriver:
   - Перейдите: [https://chromedriver.chromium.org/downloads](https://chromedriver.chromium.org/downloads)
   - Скачайте **именно ту версию**, которая совпадает с установленным Chrome
   - Поместите `chromedriver.exe` в папку `drivers` в проекте

---

## Шаг 4. Клонируйте проект

Если у вас установлен Git:

```bash
git clone <URL на ваш репозиторий>
cd QA_trainee
```

Или скачайте ZIP-архив с GitHub, распакуйте его.

---

##  Шаг 5. Убедитесь, что структура проекта такая:

```
QA_trainee/
│
├── drivers/
│   └── chromedriver.exe
├── src/
│   └── test/
│       └── java/
│           └── ThirdTest.java и др.
├── pom.xml
```

---

## Шаг 6. Запуск автотестов

В терминале, находясь в корне проекта:

```bash
mvn test
```

После этого вы увидите лог выполнения тестов в терминале. Убедитесь, что браузер открывается и тесты проходят.

---
Готово! Теперь вы можете запускать автотесты!





