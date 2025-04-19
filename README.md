# Проект QA-trainee-assignment-spring-2025

Привет! Меня зовут Иван. 

В этом репозитории находится тестовое задание для отбора на стражировку в Авито по направлению QA-инженер.

Ссылка на задание: [QA-trainee-assignment-spring-2025](https://github.com/avito-tech/tech-internship/blob/main/Tech%20Internships/QA/QA-trainee-assignment-spring-2025/QA-trainee-assignment-spring-2025.md)

# Структура проекта:
 - [TASK_1.md](./TASK_1.md) - решение задания 1
 - [QA_trainee](./QA_trainee) - проект с автотестами на языке Java для задания 2
 - [TESTCASES.md](./TESTCASES.md) - список тест-кейсов для проверки пользовательских сценариев для задания 2
 - [BUGS.md](./BUGS.md) - баг-репорт задания 2

---
## Задание 1

В данном задании нужно проанализировать скриншот страницы Авито с результатами поиска, перечислить все имеющиеся баги и указать их приоритет (high, medium, low).

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

##  Установите Java JDK

1. Скачайте **Temurin 17 (LTS)** с сайта [https://adoptium.net/temurin/releases/?version=17](https://adoptium.net/temurin/releases/?version=17)
2. Распакуйте архив (например, в `c:\Program Files\ jdk-17.<version>`).
3. Добавьте JDK в системные переменные переменные среды (Windows):
   - Создайте переменную `JAVA_HOME` → путь до папки JDK
   - В `Path` добавьте: `%JAVA_HOME%\bin`
     
4. После установки, откройте терминал/командную строку и проверьте установку с помощью команды ниже

```bash
java -version
```

Должно отобразиться что-то вроде:

```
openjdk version "17.x.x" 202x-xx-xx
```

---

## Установите Apache Maven

1. Скачайте последнюю версию Maven: [https://maven.apache.org/download.cgi](https://maven.apache.org/download.cgi)
2. Распакуйте архив (например, в `c:\Program Files\apache-maven-<version>`)
3. Добавьте Maven в системные переменные переменные среды (Windows):
   - Создайте переменную `MAVEN_HOME` → путь до папки Maven
   - В `Path` добавьте: `%MAVEN_HOME%\bin`

4. Проверьте установку командой, вывод должен содержать версию Maven и Java

```bash
mvn -v
```
---

## Установите Google Chrome

1. Скачайте и установите браузер [Google Chrome](https://www.google.com/chrome/)
2. После установки проверьте версию браузера (Настройки → О Chrome)
3. Скачайте соответствующий ChromeDriver:
   
   - Перейдите по ссылке [https://chromedriver.chromium.org/downloads](https://chromedriver.chromium.org/downloads)
   - Скачайте версию, которая совпадает с установленным Chrome
   - Поместите `chromedriver.exe` в папку `drivers` в проекте

---

## Клонируйте проект

Если у вас установлен Git, то воспользуйтесь командами ниже. Или скачайте ZIP-архив с GitHub и распакуйте его.

```bash
git clone https://github.com/KudryashovIA/QA-trainee-assignment-spring-2025.git
```
```bash
cd QA_trainee
```
---

## Запустите автотесты

Находясь в корне проекта, напишите в терминале:

```bash
mvn test
```

После этого вы увидите лог выполнения тестов в терминале. Убедитесь, что браузер открывается и тесты проходят.

Также можно открыть проект через IDE, например, [IntelliJ IDEA](https://www.jetbrains.com/idea/). 
Чтобы запустить все тесты, откройте вкладку Maven → Lifecycle → двойной клик на `test`. Для запуска одного теста кликните на зеленую стрелку слева от метода → Run.




