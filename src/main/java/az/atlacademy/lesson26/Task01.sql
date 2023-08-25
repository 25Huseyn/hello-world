CREATE table Customers
(
    customerId    serial primary key,
    customerName  varchar(20) NOT NULL,
    customerEmail varchar(50) UNIQUE,
    customrAge    INTEGER CHECK (customerAge >= 18),
    customerCity  VARCHAR(35) DEFAULT 'Not İncluded';
)
CREATE INDEX Customers_customerEmail ON Customers (customerEmail);

INSERT INTO Customers (customerName, customerEmail, customrAge, customerCity,)
VALUES ('John ', 'john@example.com', 30, 'New York'),
       ('Jon ', 'jon@example.com', 20, 'New York'),
       ('Don ', 'don@example.com', 26, '');
