package az.atlacademy.lesson31;

import az.atlacademy.lesson30.Product;
import az.atlacademy.lesson30.User;

import java.sql.*;

public class ProcessingApp {
    private static final String CALL_QUERY_FOR_PROCEDURE = "call my_simple_procedure()";
    private static final String QUERY_FOR_ALL_USERS_BY_ID = "select * from users WHERE id = ?;";
    private static final String QUERY_FOR_CREATING_USER = "insert into users(name,email,phone_number) values(?,?,?);";
    private static final String QUERY_FOR_ALL_PRODUCT = "select * from products;";
    private static final String QUERY_FOR_CREATING_PRODUCT = "insert into products(name,price) values(?,?);";


    public static void main(String[] args) {
        var process = new ProcessingApp();
        process.run_2();
        run_3(new User("Alex", "Alex@gmail.com", 123456789));
        run_4();
        run_5(new Product("Apple", 1234.45));
    }


    public void run_2() {
        try (Connection connection = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/lesson28db_homework",
                        "postgres",
                        "mysecretpassword")) {
            PreparedStatement query = connection.prepareStatement(QUERY_FOR_ALL_USERS_BY_ID);
            query.setInt(1, 1);
            ResultSet resultSet = query.executeQuery();
            resultSet.next();
            System.out.println("name: " + resultSet.getString("name") +
                    "\n email: " + resultSet.getString("email") +
                    "\n phone_number: " + resultSet.getString("phone_number"));
            resultSet.close();
            query.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void run_3(User user) {
        try (Connection connection = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/lesson29",
                        "postgres",
                        "mysecretpassword")) {
            PreparedStatement query = connection.prepareStatement(QUERY_FOR_CREATING_USER);
            query.setString(1, user.getName());
            query.setString(2, user.getEmail());
            query.setInt(3, user.getPhone_number());
            int affectedRows = query.executeUpdate();
            System.out.println(affectedRows);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void run_4() {
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/lesson29",
                "postgres",
                "mysecretpassword")) {
            PreparedStatement query = connection.prepareStatement(QUERY_FOR_ALL_PRODUCT);
            ResultSet resultSet = query.executeQuery();
            resultSet.next();
            String name = resultSet.getString("name");
            Double price = resultSet.getDouble("price");
            System.out.printf("name: %sprice: %s%n", name, price);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void run_5(Product product) {
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/lesson29",
                "postgres",
                "mysecretpassword")) {
            PreparedStatement query = connection.prepareStatement(QUERY_FOR_CREATING_PRODUCT);
            query.setString(1, product.getName());
            query.setDouble(2, product.getPrice());
            int affectedRows = query.executeUpdate();
            System.out.println(affectedRows);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void process_callabeStatement(Connection connection) {
        try (var callableStatement = connection.prepareCall(CALL_QUERY_FOR_PROCEDURE)) {
            callableStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
