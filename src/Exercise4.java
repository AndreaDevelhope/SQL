import java.sql.*;

public class Exercise4 {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "developer", "passwordhere");

        Statement statement = connection.createStatement();
//        statement.executeUpdate("ALTER TABLE students ADD COLUMN country VARCHAR(30)");
//        statement.executeUpdate("UPDATE students SET country = 'Germany'");
//        statement.executeUpdate("UPDATE students SET country = 'Italy' LIMIT 2");

        statement.executeUpdate("UPDATE students SET country = 'Italy' WHERE student_id < 3 AND student_id > 0");
        statement.executeUpdate("UPDATE students SET country = 'Germany' WHERE student_id > 2 AND student_id < 5");

        ResultSet resultSet = statement.executeQuery("SELECT * FROM students");

        while(resultSet.next()){
            System.out.println(resultSet.getString("country"));
        }
    }
}
