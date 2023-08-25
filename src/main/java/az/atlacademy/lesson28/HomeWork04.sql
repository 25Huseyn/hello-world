create table books
(
    id               serial primary key,
    title            varchar(35),
    publication_year date,
    author           varchar(27),
    publisher        varchar(27),
    number_of_copies int
);
insert into books(title, publication_year, aouthor, publisher, number_of_copies)
values ('Book 1', '2020-01-01', 'Author 1', 'Publisher 1', 5),
       ('Book 2', '2021-02-02', 'Author 2', 'Publisher 2', 3),
       ('Book 3', '2019-03-03', 'Author 3', 'Publisher 3', 2),
       ('Book 4', '2022-04-04', 'Author 4', 'Publisher 4', 1);

create table readers
(
    id           serial primary key,
    first_name   varchar(50),
    last_name    varchar(50),
    adress       varchar(50),
    email        varchar(50),
    phone_number varchar(10)
);
alter table readers
alter
column phone_number type numeric(10, 0) using cast(phone_number as numeric);

insert into readers(first_name, last_name, adress, email, phone_number)
values ('John', 'Doe', '123 Main St', 'johndoe@example.com', '1234567890'),
       ('Jane', 'Smith', '456 Elm St', 'janesmith@example.com', '9876543210'),
       ('Robert', 'Johnson', '789 Oak St', 'robertjohnson@example.com', '5555555555');

create table genres
(
    id         serial primary key,
    genre_name varchar(10)
);
INSERT INTO genres (genre_name)
VALUES ('Fantasy'),
       ('Romance'),
       ('Mystery'),
       ('Science ');

create table authors
(
    id         serial primary key,
    first_name varchar(40),
    last_name  varchar(40),
    birth_year date,
    death_year date
);
insert into authors(first_name, last_name, birth_year, death_year)
VALUES ('Author 1', 'Lastname 1', '1990-01-01', NULL),
       ('Author 2', 'Lastname 2', '1985-02-15', NULL),
       ('Author 3', 'Lastname 3', '1977-05-10', '2022-03-28');

create table loan
(
    id          serial primary key,
    book_id     int references books (id),
    reader_id   int references readers (id),
    loan_date   date,
    return_date date
);

INSERT INTO loan (book_id, reader_id, loan_date, return_date)
VALUES (2, 1, '2023-01-01', NULL),
       (2, 2, '2023-02-02', NULL),
       (3, 3, '2023-03-03', '2023-04-03');

create table authorship
(
    id        serial primary key,
    book_id   int references books (id),
    author_id int references authors (id)
);
insert into authorship(book_id, author_id)
VALUES (1, 1),
       (1, 2),
       (3, 1),
       (1, 3),
       (3, 2);

create table genre_assignment
(
    id       serial primary key,
    book_id  int references books (id),
    genre_id int references genres (id)
);
insert into genre_assignment(book_id, genre_id)
VALUES (1, 2),
       (2, 3),
       (1, 3),
       (1, 1);


select *
from genre_assignment;
select *
from books;
select *
from readers;
select *
from authorship;
select *
from authors;
select *
from loan;
select *
from genres;


--Query for adding a new book
INSERT INTO books(title, publication_year, aouthor, publisher, number_of_copies)
VALUES ('Chess', '2020-01-01', 'Stephan Zvek', 'Parlaq Imzalar', 4);

--Query for register a new reader
INSERT INTO readers (first_name, last_name, adress, email, phone_number)
VALUES ('Samir', 'Aghayev', 'Kubinka', 'samir@gmail.com', 1234567890);

--Query for issuing a book to reader
select *
from readers r
where r.id = 3;
select *
from books b
where b.title like '%4';
INSERT INTO loan (book_id, reader_id, loan_date, return_date)
VALUES (2, 3, current_date, current_date + 5);
update books b
set number_of_copies = b.number_of_copies - 1
where id = 5;
select b.number_of_copies
from books b
where b.id = 5;
--Query for returning a book from a reader
UPDATE loan
SET return_date = current_date
where book_id = 2
  and reader_id = 3;
--Query for searching books based on various criteria
select *
from books
where title like '%es%'
  and number_of_copies > 3
  and publisher like 'P%'
  and author like '%k';

--Query for searching currently available books.
select *
from books
         inner join loan on loan.book_id = books.id
where return_date <= current_date;

--Query for searching popular books among readers
select *
from books
where number_of_copies = (select MAX(number_of_copies) from books);
--Query for searching books read by a specific reader.
select *
from book
         join loan on books.id = loan.book_id
         join readers on loan.reader_id = readers.id
where readers.id = 3;
--Query for searching books written by a specific author
select *
from books
         join authorship on books.id = authorship.book_id
         join authors on authors.id = authorship.author_id
where authors.id = 2;
--Query for updating book information.
UPDATE books
SET title            = 'Murder on the Orient Express',
    publication_year = '1934-01-01',
    author           = 'Agatha Christie',
    publisher        = 'Collins Crime Club',
    number_of_copies = 10000;

--Query for deleting a book from the library
delete
from books
where id = 1;
--Query for searching books by genre
select *
from books
         join genre_assignment ga on books.id = ga.book_id
where genre_id = 1;
--Query for calculating the total number of books borrowed by a reader
SELECT COUNT(book_id) AS borrowed_books_count
FROM loan
WHERE reader_id = 2;
--Query for finding the most borrowed book in the library


--Query for updating reader information.
UPDATE readers
SET first_name   = 'Simba',
    last_name    = 'Mufasa',
    email        = 'SimbaMufasa@gmail.com',
    adress       = 'Safari',
    phone_number = 3478752243;