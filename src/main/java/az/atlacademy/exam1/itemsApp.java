package az.atlacademy.exam1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class itemsApp {
    private static final String QUERY_FOR_UPDATING_ITEMS = "insert into items(item_type, item_price) values(?,?,?) where item_id = ?;";

    public static void main(String[] args) {
        updateByPin(123);
    }

    private static void updateByPin(int item_id) {
        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5432/lesson28db",
                "postgres",
                "mysecretpassword")) {
            PreparedStatement query = conn.prepareStatement(QUERY_FOR_UPDATING_ITEMS);
            query.setInt(1, item_id);
            int affectedRows = query.executeUpdate();
            System.out.println(affectedRows);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

