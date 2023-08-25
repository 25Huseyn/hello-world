create
database exam;
--1ci sual
create table workers
(
    worker_id    serial primary key,
    first_name   varchar(35),
    last_name    varchar(35),
    salary       numeric(7),
    joining_date date,
    department   varchar(20)
);
INSERT INTO workers(first_name, last_name, salary, joining_date, department)
VALUES ('Monika', 'Arora', 100000, '2014-02-20', 'HR'),
       ('Niharika', 'Verma', 80000, '2014-06-11', 'Admin');

SELECT department, COUNT(*) as no_of_workers
FROM workers
GROUP BY department
ORDER BY no_of_workers DESC;


--2ci sual
create table employee_details
(
    emp_id          serial primary key,
    full_name       varchar(35),
    manager_id      int,
    date_of_joining date,
    city            varchar(20)
);
drop table employee_details;
CREATE TABLE employee_salaries
(
    project  VARCHAR(30),
    emp_id   INT REFERENCES employee_details (emp_id),
    salary   DECIMAL(12, 3),
    variable INT
);


SELECT employee_details.full_name, employee_salaries.salary
FROM employee_details
         LEFT JOIN employee_salaries ON employee_details.emp_id = employee_salaries.emp_id;


--3cu sual
SELECT *
FROM employee_details
WHERE date_of_joining >= '2020-01-01'
  AND date_of_joining <= '2020-05-01';


--4cu sual
create table employees
(
    employee_id   serial primary key,
    first_name    varchar(30),
    last_name     varchar(30),
    email         varchar(30),
    phone_number  numeric(13),
    hire_date     date,
    job_id        varchar(20),
    salary        DECIMAL(12, 3),
    comission_pct decimal(10, 3),
    manager_id    SERIAL UNIQUE NOT NULL,
    deparment_id  SERIAL UNIQUE NOT NULL
);
SELECT employees.first_name, employees.last_name, employees.employee_id, employees.salary
FROM employees
         JOIN employee_details ON employees.manager_id = employee_details.manager_id
WHERE employees.first_name = 'Payam';

--5ci sual
CREATE TABLE items
(
    item_id    SERIAL PRIMARY KEY,
    item_type  VARCHAR(255),
    item_price DECIMAL(10, 2)
);
