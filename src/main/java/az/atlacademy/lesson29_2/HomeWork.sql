CREATE TABLE Products
(
    ProductID   serial primary key,
    Name        varchar(20),
    Price       INT,
    Quantity    INT,
    Description varchar(40),
    CategoryID  int REFERENCES Categories (CategoryID)
);
ALTER TABLE Products
    ALTER COLUMN Price TYPE DECIMAL(7,2);

CREATE TABLE Categories
(
    CategoryID serial primary key,
    Name       varchar(20)
);

create table Customers
(
    CustomerID  serial primary key,
    FirstName   varchar(20),
    LastName    varchar(20),
    Adress      varchar(20),
    Email       varchar(40),
    PhoneNumber numeric(13)
);

create table Orders
(
    OrderaID   serial primary key,
    CustomerID INTEGER references Customers (CustomerID),
    OrderDATE  DATE
);

create table OrderDetails
(
    OrderDetailID serial primary key,
    OrderID       INTEGER REFERENCES Orders (OrderaID),
    ProductyID    INTEGER REFERENCES Products (ProductID),
    Quantity      INT
);

INSERT INTO Products(Name, Price, Quantity, Description, CategoryID)
VALUES ('Product 1', 132.99, 12, 'Earbuds', 1),
       ('Product 2', 1232.99, 34, 'Laptop', 2),
       ('Product 3', 1342.99, 14, 'Laptop', 3),
       ('Product 4', 162.99, 2, 'Phone', 4),
       ('Product 5', 152.99, 24, 'Phone', 5);


INSERT INTO Categories(Name)
VALUES ('Categories 1'),
       ('Categories 2'),
       ('Categories 3'),
       ('Categories 4'),
       ('Categories 5');

INSERT INTO Customers(FirstName, LastName, Adress, Email, PhoneNumber)
VALUES ('Jane', 'Smith', 'London', 'Jane.Smith@gmail.com', 234567732),
       ('Jon', 'Wick', 'London', 'Jon.Wick@gmail.com', 326563373),
       ('Maykl', 'Jackson', 'Brazilia', 'Maykl.Jackson@gmail.com', 123456789),
       ('Linda', 'Lour', 'Paris', 'Linda.Lour@gmail.com', 183643538),
       ('Bob', 'Arleone', 'Roma', 'Bob.Arleone@gmail.com', 937462786),
       ('Bruce', 'Kunz', 'Missouri', 'Bruce.Kunz@gmail.com', 328756332);

INSERT INTO Orders(CustomerID, OrderDATE)
VALUES (1, '2023-07-02'),
       (1, '2022-03-02'),
       (2, '2023-04-05'),
       (2, '2021-02-12'),
       (3, '2022-06-18'),
       (4, '2023-05-15'),
       (4, '2023-03-01'),
       (5, '2022-02-16'),
       (5, '2021-09-18'),
       (6, '2023-06-02');

INSERT INTO OrderDetails(OrderID, ProductyID, Quantity)
VALUES (1, 1, 4),
       (2, 2, 5),
       (3, 3, 10),
       (4, 4, 14),
       (6, 5, 4),
       (7, 1, 4),
       (8, 4, 4),
       (9, 3, 4),
       (6, 2, 4),
       (10, 1, 4);

--Get a list of all products
select *
from Products;
--Get a list of all categories of products
select *
from categories;
--Get a list of all customers
select *
from Customers;
--Get a list of all orders
select *
from Orders;
--Get a list of all order details
select *
from orderdetails;
--Get information about a specific product by its ID
select *
from Products
where ProductID = 1;
--Get a list of products in a specific category
select *
from Products
where CategoryID = 1;
--Get information about a customer by their ID
select *
from Customers
where CustomerID = 1;
--Get a list of orders for a specific customer
select *
from Orders
WHERE CustomerID = 1;
--Get a list of order details for a specific order
select *
from OrderDetails
where OrderID = 1;
--Update the price of a product by its ID
UPDATE Products
set Price = 180
where ProductID = 1;
--Add a new product
INSERT INTO Products(Name, Price, Quantity, Description, CategoryID)
VALUES ('Apple', 2100.99, 23, 'Phone', 4);
--Delete a product by its ID
DELETE
FROM Products
WHERE ProductID = 1;

SELECT  FirstName, Name, OrderDetails.Quantity, Products.Price, OrderDetails.Quantity * Products.Price as totalPrice
FROM Customers
         JOIN Orders ON Customers.CustomerID = Orders.CustomerID
         JOIN OrderDetails ON Orders.OrderaID = OrderDetails.OrderID
         JOIN Products ON OrderDetails.ProductyID = Products.ProductID
Where Customers.CustomerID =1;