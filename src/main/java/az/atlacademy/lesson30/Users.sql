CREATE table users
(
    id           serial primary key,
    name         varchar(30),
    email        varchar(40),
    phone_number numeric(13)
);
INSERT INTO users(name, email, phone_number) VALUES ('Jane','Jane@gmail.com',232123221),
                                                    ('Jon','Jon@gmail.com',326432634),
                                                    ('Li','li@gmail.com',342777843),
                                                    ('Linda','Linda@gmail.com',932763237),
                                                    ('Dominic','Dominic@gmail.com',424653461);
select *
from current_database();