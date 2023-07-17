package az.atlacademy.lesson29;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class JDBCApp {
    public static final String getAllStudentSql = "SELECT * FROM student;";

    public static void main(String[] args) {
        getAllStudent().forEach(System.out::println);
    }

    private static List<Student> getAllStudent() {
        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5432/lesson28db",
                "postgres",
                "mysecretpassword")) {
            PreparedStatement query = conn.prepareStatement(getAllStudentSql);
            ResultSet resultSet = query.executeQuery();
            List<Student> student = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String pin = resultSet.getString("pin");
                student.add(new Student(id, name, pin));
            }
            return student;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
