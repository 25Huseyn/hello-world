CREATE table users
(
    id           serial primary key,
    name         varchar(30),
    email        varchar(40),
    phone_number numeric(13)
);
INSERT INTO users(name, email, phone_number)
VALUES ('Jane', 'Jane@gmail.com', 232123221),
       ('Jon', 'Jon@gmail.com', 326432634),
       ('Li', 'li@gmail.com', 342777843),
       ('Linda', 'Linda@gmail.com', 932763237),
       ('Dominic', 'Dominic@gmail.com', 424653461);
select *
from current_database();
create table products
(
    id    serial primary key,
    name  varchar(30)    not null,
    price decimal(15, 2) not null
);
select *
from products;
delete
from users;

call my_simple_procedure();
create function my_custom_sum(a integer, b integer, c integer) returns integer
BEGIN
    ATOMIC
    return a + b + c;
end;
select my_custom_sum(5, 5, 5);
DELETE
from users;