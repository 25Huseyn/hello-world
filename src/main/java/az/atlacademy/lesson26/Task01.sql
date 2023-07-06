CREATE table Customers (
CustomerId serial primary key,
CustomerName varchar(20) NOT NULL,
CustomerEmail varchar(50) UNIQUE,
CustomrAge INTEGER  CHECK(Customerage => 18),
CustomerCity VARCHAR(35) DEFAULT 'Not İncluded';
)
CREATE INDEX Customers_CustomerEmail ON Customers(CustomerEmail);

INSERT INTO Customers (CustomerName,CustomerEmail , CustomrAge, CustomerCity,)
VALUES ('John ', 'john@example.com', 30, 'New York'),
('Jon ', 'jon@example.com', 20, 'New York'),
('Don ', 'don@example.com', 26, '');
