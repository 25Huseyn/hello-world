
SELECT * FROM Products
ORDER BY LENGTH(ProductName) DESC
LIMIT 1;



SELECT * FROM Products
WHERE ProductName LIKE '%hot%';