create table books
(
    id               serial primary key,
    title            varchar(35),
    publication_year date,
    aouthor          varchar(27),
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
VALUES (1, 1, '2023-01-01', NULL),
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