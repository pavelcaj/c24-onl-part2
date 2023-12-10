package lesson35;

import java.sql.Connection;
import java.sql.Statement;

public class DatabaseInitializer {
    public static void initializeDatabase() {
        try (Connection connection = DBUtil.getConnection();
             Statement statement = connection.createStatement()) {
            String createTableQuery = "CREATE TABLE IF NOT EXISTS users ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "name VARCHAR(255),"
                    + "age INT)";
            statement.executeUpdate(createTableQuery);
            String insertDataQuery = "INSERT INTO users (name, age) VALUES ('John', 25), ('Alice', 30)";
            statement.executeUpdate(insertDataQuery);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}