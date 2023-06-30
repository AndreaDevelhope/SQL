import java.sql.*;

//     Creating the Table "students"
//CREATE TABLE IF NOT EXISTS `newdb`.`students` (
//        `student_id` INT(10) NOT NULL AUTO_INCREMENT,
//        `last_name` VARCHAR(30),
//        `first_name` VARCHAR(30),
//        PRIMARY KEY (`student_id`)
//        );

//      Populating the Table with 4 students
//INSERT INTO students (last_name, first_name)
//        VALUES
//        ('Smith', 'John'),
//        ('Johnson', 'Emma'),
//        ('Williams', 'Michael'),
//        ('Brown', 'Olivia');
//


public class Exercise2 {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "developer", "passwordhere");

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM students");
    }
}