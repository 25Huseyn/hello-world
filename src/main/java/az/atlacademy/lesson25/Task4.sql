SELECT Sum(Price), CategoryID
FROM Products
GROUP BY CategoryID;