package az.atlacademy.lesson30;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserApp {

    private static final String GETALLUSERSSQL = "SELECT * FROM users;";
    private static final String CREATEUSERSSQL = "INSERT INTO users(name,email,phone_number) VALUES (?,?,?)";
    private static final String DELETEUSERSQL = "DELETE FROM users WHERE name = ?;";

    public static void main(String[] args) {
        getAllUser().forEach(System.out::println);
        createUser(new User("Tom", "Tom@gmail.com", 214312321));
        getAllUser().forEach(System.out::println);
        deleteUser("li");
        getAllUser().forEach(System.out::println);

    }

    private static List<User> getAllUser() {
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/lesson28db_homework",
                "postgres",
                "mysecretpassword")) {
            PreparedStatement query = connection.prepareStatement(GETALLUSERSSQL);
            ResultSet resultSet = query.executeQuery();
            List<User> user = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                int phone_number = resultSet.getInt("phone_number");
                user.add(new User(id, name, email, phone_number));
            }
            return user;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    private static void createUser(User user) {
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/lesson28db_homework",
                "postgres",
                "mysecretpassword")) {
            PreparedStatement query = connection.prepareStatement(CREATEUSERSSQL);
            query.setString(1, user.getName());
            query.setString(2, user.getEmail());
            query.setInt(3, user.getPhone_number());
            int affectedRows = query.executeUpdate();
            System.out.println(affectedRows);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void deleteUser(String name) {
        try (Connection connection = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/lesson28db_homework",
                        "postgres",
                        "mysecretpassword")) {
            PreparedStatement query = connection.prepareStatement(DELETEUSERSQL);
            query.setString(1, name);
            int affectedRows = query.executeUpdate();
            System.out.println(affectedRows);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

