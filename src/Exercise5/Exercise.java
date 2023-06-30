package Exercise5;

import java.sql.*;
import java.util.ArrayList;

public class Exercise {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "developer", "passwordhere");

        Statement statement = connection.createStatement();

//        statement.executeUpdate("CREATE VIEW italian_students AS SELECT first_name, last_name FROM students WHERE country = 'Italy'");
//        statement.executeUpdate("CREATE VIEW german_students AS SELECT first_name, last_name FROM students WHERE country = 'Germany'");

        ArrayList<Student> italian_students = new ArrayList<>();
        ResultSet resultSetIT = statement.executeQuery("SELECT * FROM italian_students");
        while(resultSetIT.next()){
            String firstName = resultSetIT.getString("first_name");
            String lastName = resultSetIT.getString("last_name");
            Student italianStudent = new Student(firstName,lastName);
            italian_students.add(italianStudent);
        }
        System.out.println("The italian students are:" + italian_students);

        ArrayList<Student> german_students = new ArrayList<>();
        ResultSet resultSetDE = statement.executeQuery("SELECT * FROM german_students");
        while(resultSetDE.next()){
            String firstName = resultSetDE.getString("first_name");
            String lastName = resultSetDE.getString("last_name");
            Student german_student = new Student(firstName,lastName);
            german_students.add(german_student);
        }
        System.out.println("The german students are:" + german_students);
    }
}
