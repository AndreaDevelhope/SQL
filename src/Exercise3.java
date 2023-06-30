import java.sql.*;
import java.util.ArrayList;

public class Exercise3 {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "developer", "passwordhere");

        Statement statement = connection.createStatement();

        ArrayList<String> surnames = new ArrayList<>();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM students");

        while(resultSet.next()){
            System.out.println(resultSet.getString("first_name"));
            String lastName = resultSet.getString("last_name");
            surnames.add(lastName);
        }

        System.out.println(surnames);
    }
}