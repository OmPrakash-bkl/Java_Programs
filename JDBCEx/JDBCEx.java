import java.sql.*;

public class JDBCEx {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "password";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM employees");

            while(resultSet.next()) {
                System.out.println("Employee Id: " + resultSet.getInt("id")+", Name: " + resultSet.getString("name") +
                ", Salary: " + resultSet.getDouble("salary"));
            }
        } catch(SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        }
    }
}
