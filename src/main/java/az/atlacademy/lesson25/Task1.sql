SELECT *
FROM Products
ORDER BY LENGTH(ProductName) DESC LIMIT 1;

SELECT *
FROM Products
WHERE (SELECT MAX(LENGTH(ProductName)) FROM Products) AS MaxName;

SELECT MAX(LENGTH(ProductName))
FROM Products;