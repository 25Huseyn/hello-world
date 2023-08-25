CREATE TABLE Sales
(
    ID       SERIAL PRIMARY KEY,
    Product  varchar(30),
    Quantity INTEGER,
    Price    DECIMAL(10, 2)
);
INSERT INTO Sales (Product, Quantity, Price)
VALUES ('Apple', 5, 2.50),
       ('Orange', 3, 1.75),
       ('Banana', 2, 0.50),
       ('Apple', 4, 2.20),
       ('Orange', 2, 1.80);
SELECT Product, SUM(Quantity), AVG(Price)
from Sales
GROUP by Product;

SELECT SUM(Price), AVG(Price), MAX(Price), MIN(Price)
FROM Sales;

CREATE TABLE Expenses
(
    ID       SERIAL PRIMARY KEY,
    Category varchar(30),
    Amount   DECIMAL(10, 2)
);
INSERT INTO Expenses (Category, Amount)
VALUES ('Apple', 2.50),
       ('Orange', 1.75),
       ('Banana', 0.50),
       ('Apple', 2.20),
       ('Orange', 1.80);
SELECT Category, SUM(Amount), AVG(Amount)
from Sales
GROUP by Category;

CREATE TABLE Products
(
    ID    SERIAL PRIMARY KEY,
    Name  varchar(30),
    Price DECIMAL(10, 2)
);
INSERT INTO Products(Name, Price)
VALUES ('Apple', 2.50),
       ('Orange', 1.75),
       ('Banana', 0.50),
       ('Apple', 2.20),
       ('Orange', 1.80);
SELECT *
FROM Products
WHERE Price = (SELECT MAX(Price) FROM Products);
SELECT *
FROM Products
WHERE Price = (SELECT MIN(Price) FROM Products);

SELECT *
FROM Products
where price IN (MAX(Price), MIN(Price) FROM Products);

CREATE TABLE Students
(
    ID        serial PRIMARY KEY,
    Name      varchar,
    Age       int,
    Gender    varchar,
    avg_grade decimal(2, 2)
);
CREATE TABLE Grades
(
    StudentID  int,
    Grade      decimal(2, 2),
    student_id int references Students (ID)
);
INSERT INTO Students (Name, Age, Gender, avg_grade)
VALUES ('John', 18, 'Male', 80.12),
       ('Emma', 19, 'Female', 81.99),
       ('Michael', 20, 'Male', 60.60),
       ('Sophia', 18, 'Female', 90.50);
INSERT INTO Grades (StudentID, Course, Grade)
VALUES (1, 'Math', 85.5),
       (1, 'Science', 92.0),
       (2, 'Math', 90.0),
       (2, 'Science', 88.5),
       (3, 'Math', 75.0),
       (3, 'Science', 82.0),
       (4, 'Math', 88.0),
       (4, 'Science', 94.5);
SELECT AVG(Grade)
FROM Grades;
SELECT *
from Students
where avg_grade > (SELECT AVG(Grade) FROM Grades);

CREATE TABLE MaleStudents
(
    ID    SERIAL PRIMARY KEY,
    Name  varchar(20),
    Age   int,
    Grade DECIMAL(2, 2)
);
CREATE TABLE FemaleStudents
(
    ID    SERIAL PRIMARY KEY,
    Name  varchar(20),
    Age   int,
    Grade DECIMAL(2, 2)
);

INSERT
MaleStudents(Name, Age, Grade) VALUES
('Corc',18,61.22),
('John',19,76.52),
('Kobe',18,81.76);
INSERT
FemaleStudents(Name, Age, Grade) VALUES
('Linda',18,61.22),
('Kate',20,76.52),
('Jane',19,81.76);

SELECT Name
FROM MaleStudents
UNION
SELECT Name
FROM FemaleStudents;

SELECT Grade
FROM MaleStudents
INTERSECT
SELECT Grade
FROM FemaleStudents;

SELECT Age
FROM MaleStudents
EXCEPT
SELECT Age
FROM FemaleStudents;