ru text
# Введение в SQL

> Привет! На связи домашнее задание урока 3.4. Введение в SQL.
В прошлой домашней работе мы смогли поработать с базами данных: установили базу данных PostgreSQL, подключили к ней наше приложение и переделали логику сервисов так, чтобы все наши данные теперь хранились в БД. 

Цель сегодняшней домашней работы — углубиться в язык запросов SQL и написать несколько SELECT-методов. А также установить связь ManyToOne между факультетами и студентами.

*Среднее время выполнения: 120 минут.*
> 

**Шаг 1**

Добавить эндпоинт для получения всех студентов, возраст которых находится в промежутке, пришедшем в запросе, т. е. в GET-запросе будут передаваться два числа (min и max). Для этого в репозитории следует создать метод findByAgeBetween().

Добавить эндпоинт для поиска факультета по имени или цвету, игнорируя регистр, т. е. в GET-запросе будет передана строка, по которой будет происходить фильтрация.

<aside>
 **Критерии оценки:** Созданы два эндпоинта. Первый возвращает студентов, у которых возраст попадает в заданные границы. Второй возвращает факультет по названию или цвету.

</aside>

**Шаг 2**

Подключиться с помощью IDEA к базе данных и выполнить простой запрос select * from student.

<aside>
 **Критерии оценки:** Подключение установлено, есть возможность просмотреть список таблиц. И как следствие SELECT-запрос возвращает данные о студентах.

</aside>

**Шаг 3**

Составить следующие SQL-запросы:

1. Получить всех студентов, возраст которых находится между 10 и 20 (можно подставить любые числа, главное, чтобы нижняя граница была меньше верхней).
2. Получить всех студентов, но отобразить только список их имен.
3. Получить всех студентов, у которых в имени присутствует буква «О» (или любая другая).
4. Получить всех студентов, у которых возраст меньше идентификатора.
5. Получить всех студентов упорядоченных по возрасту.

В корне проекта создать файл scripts.sql и поместить в него составленные запросы.

<aside>
 **Критерии оценки:** В результате должно получиться 5 SQL-запросов, которые выполняют описанные требования. Составленные запросы расположены в файле scripts.sql

</aside>

**Шаг 4**

Настроить связь ManyToOne между студентами и факультетом. При этом у модели студента должно быть создано поле Faculty, а у модели факультета — список студентов.

Добавить два эндпоинта в соответствующие контроллеры которые позволят:

1. Получить факультет студента
2. Получить студентов факультета

<aside>
 **Критерии оценки:** Настроить связь ManyToOne между студентами и факультетом. В результате в таблице студентов должна появиться колонка  faculty_id. Добавлены два эндпоинта, которые позволяют получить студентов факультета и факультет студента.

</aside>



eng text
# Introduction to SQL

> Hello! The homework of lesson 3.4. Introduction to SQL is in touch.
In our previous homework, we were able to work with databases: we installed a PostgreSQL database, connected our application to it, and redesigned the logic of the services so that all our data is now stored in the database. 

The purpose of today's homework is to delve into the SQL query language and write some SELECT methods. And also to establish a ManyToOne connection between faculties and students.

*Average execution time: 120 minutes.*
> 

**Step 1**

Add an endpoint to get all students whose age is within the range specified in the request, i.e. two numbers (min and max) will be passed in the GET request. To do this, create the findByAgeBetween() method in the repository.

Add an endpoint to search for faculty by name or color, ignoring case, i.e. the GET request will contain a string that will be filtered.

<aside>
 **Evaluation criteria:** Two endpoints have been created. The first one returns students whose age falls within the specified limits. The second one returns the faculty by name or color.

</aside>

**Step 2**

Connect to the database using IDEA and run a simple select * from student query.

<aside>
 **Evaluation criteria:** The connection is established, it is possible to view the list of tables. As a result, the SELECT query returns data about students.

</aside>

**Step 3**

Create the following SQL queries:

1. Get all students whose age is between 10 and 20 (you can substitute any numbers, as long as the lower bound is less than the upper one).
2. Get all the students, but only display a list of their names.
3. Get all students who have the letter "O" in their name (or any other).
4. Get all students whose age is less than the ID.
5. Get all students sorted by age.

Create a scripts.sql file in the root of the project and place the compiled queries in it.

<aside>
 **Evaluation criteria:** The result should be 5 SQL queries that fulfill the described requirements. The compiled queries are located in the scripts.sql file

</aside>

**Step 4**

Set up a ManyToOne connection between students and faculty. In this case, the Faculty field should be created for the student model, and the faculty model should have a list of students.

Add two endpoints to the corresponding controllers that will allow:

1. Get a student's faculty
2. Get faculty students

<aside>
 **Evaluation criteria:** Set up ManyToOne communication between students and faculty. As a result, the faculty_id column should appear in the student table. Two endpoints have been added that allow you to get students of the faculty and the faculty of the student.

</aside>
