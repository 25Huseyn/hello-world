create table Employees(
EmployeeID serial primary key,
FirstName varchar(50),
LastName varchar(50),
Position varchar(50),
Salary Decimal(10,2)
);

create  table Customers(
CustomerId serial primary key,
Name varchar(50),
Email varchar(50),
Phone varchar(20)
);

create table Orders(
OrderId serial primary key,
OrderNumber VARCHAR(20),
OrderDate Date,
OrderPrice DECIMAL(10,2),
Status varchar(20),
CustomerId INT,
FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerId)
);

CREATE TABLE Products (
    ProductID SERIAL PRIMARY KEY,
    Name VARCHAR(50),
    Price DECIMAL(10, 2),
    Category VARCHAR(50)
);

create table Sales (
SaleId serial primary key,
ProductID INT,
Quantity INT,
Price DECIMAL(10, 2),
Revenue DECIMAL(10, 2),
FOREIGN KEY (ProductID) REFERENCES Products(ProductID)
);

create table Inventory(
ProductId Serial primary key,
Quantity INT,
foreign key (ProductId) REFERENCES Products(ProductId)
);

insert into Employees (FirstName,LastName,Position,Salary)
VALUES('John','Doe','Manager',5000.00),
('Jane','Smith','Salesperson',3000.00),
('Mike','Johnson','Technican',2500.00);

insert into Customers(Name,Email,Phone)
Values('Acme Corp','info@acme.com','123-456-7890'),
('XYZ Company','info@xyz.com','987-654-3210'),
('ABC Enterprises','info@abc.com','555-555-5555');

insert into Orders (OrderNumber,OrderDate,OrderPrice,Status,CustomerId)
VALUES('ORD001','2023-06-01',1000.00,'Completed',1),
('ORD002','2023-06-05',500.00,'Completed',2),
('ORD003','2023-06-10',750.00,'Pending',3);

INSERT INTO Products (Name, Price, Category)
VALUES ('Product A', 10.99, 'Electronics'),
('Product B', 25.99, 'Home & Garden'),
('Product C', 5.99, 'Books');

insert into Sales (ProductId,Quantity,Price,Revenue)
values(1,10,10.99,109.90),
(2,5,25.99,129.95),
(3, 20, 5.99, 119.80);

insert into Inventory(ProductId,Quantity)
values(1,100),
(2,50),
(3,200);

select * from Employees;

select Name,Email from Customers;

select * from Orders
where Status = 'Completed';

select Name,Price from Products
where Category ='Electronics';

select Revenue from Sales;

select Quantity from Inventory;

select FirstName,LastName from Employees
where Position ='Manager';

select * from Orders
where CustomerId = 2;

select ProductId,Quantity from Sales
where Quantity > 10;

select * from Products
where Price = (select max(Price) from Products) ;
