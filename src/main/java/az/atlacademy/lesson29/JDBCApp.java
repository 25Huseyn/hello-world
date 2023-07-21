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
    private static final String createStudentSql = "INSERT INTO student(name, pin) values (?, ?);";
    private static final String deleteStudentSql = "DELETE FROM student where pin = ?";
    private static final String updateStudentSql = "UPDATE student SET name='Alfred' WHERE pin=?;";

    public static void main(String[] args) {
        getAllStudent().forEach(System.out::println);
        deleteByPin("Ilqar42");
        getAllStudent().forEach(System.out::println);
        createStudent(new Student("Ilqar", "Ilqar42"));
        getAllStudent().forEach(System.out::println);
        updateByPin("Ilqar42");
        getAllStudent().forEach(System.out::println);
    }

    private static void updateByPin(String pin) {
        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5432/lesson28db",
                "postgres",
                "mysecretpassword")) {
            PreparedStatement query = conn.prepareStatement(updateStudentSql);
            query.setString(1, pin);
            int affectedRows = query.executeUpdate();
            System.out.println(affectedRows);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void deleteByPin(String pin) {
        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5432/lesson28db",
                "postgres",
                "mysecretpassword")) {
            PreparedStatement query = conn.prepareStatement(deleteStudentSql);
            query.setString(1, pin);
            int affectedRows = query.executeUpdate();
            System.out.println(affectedRows);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createStudent(Student student) {
        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5432/lesson28db",
                "postgres",
                "mysecretpassword")) {
            PreparedStatement query = conn.prepareStatement(createStudentSql);
            query.setString(1, student.getName());
            query.setString(2, student.getPin());
            int affectedRows = query.executeUpdate();
            System.out.println(affectedRows);

        } catch (SQLException e) {
            e.printStackTrace();
        }
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
