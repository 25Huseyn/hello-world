import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, SQLException {
       Class postgresDriverClass = Class.forName("org.postgresql.Driver");
        Constructor postgresDriverClassConstructor = postgresDriverClass.getDeclaredConstructor();
        Driver postgresDriverObject = (Driver) postgresDriverClassConstructor.newInstance();

        DriverManager.registerDriver(postgresDriverObject);

       Connection dbConnection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/lesson28db_homework","postgres","mysecretpassword");
        Statement statement = dbConnection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT FirstName, Name, OrderDetails.Quantity, Products.Price, OrderDetails.Quantity * Products.Price as totalPrice\n" +
                "FROM Orders\n" +
                "         JOIN OrderDetails ON Orders.OrderaID = OrderDetails.OrderID\n" +
                "         JOIN Products ON OrderDetails.ProductyID = Products.ProductID\n" +
                "         JOIN Customers ON Customers.CustomerID = Orders.CustomerID\n" +
                "Where Customers.FirstName = 'Jane';");

        while (resultSet.next()){
            String FirstName = resultSet.getString("FirstName");
            String Name = resultSet.getString("Name");
            double Price = resultSet.getDouble("Price");
            int Quantity = resultSet.getInt("Quantity");
            double totalPrice = resultSet.getDouble("totalPrice");

            System.out.println("");
        }
        resultSet.next();
        resultSet.close();
        statement.close();
        dbConnection.close();
    }
}