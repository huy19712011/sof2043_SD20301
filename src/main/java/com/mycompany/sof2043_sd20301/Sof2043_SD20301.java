package com.mycompany.sof2043_sd20301;

import com.mycompany.sof2043_sd20301.util.XJdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Sof2043_SD20301 {

    public static void main(String[] args) {

//        System.out.println("Hello World!");
//
//        String sql = "INSERT INTO Categories (Id, Name) VALUES(?, ?)";
//
//        XJdbc.executeUpdate(sql, "C01", "Loai 1");
//        XJdbc.executeUpdate(sql, "C02", "Loai 2");

        // students: id, name, email, phone
        // insert into students: 3 students, 3 rows
        // CRUD: getAllStudents(), getStudentById(), deleteStudent(...), updateStudent(...)
        // UI: table of students; buttons; form


        //1.
        Connection connection = null;
        Statement statement = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

//        try {
//
//            connection = XJdbc.openConnection();
//            System.out.println("Connected...");
//
//            String sql = """
//                            CREATE TABLE students(
//                                id BIGINT PRIMARY KEY,
//                                name NVARCHAR(30) NOT NULL,
//                                email NVARCHAR(50) NOT NULL,
//                                phone NVARCHAR(10) NOT NULL
//                            );
//                         """;
//
//            preparedStatement = connection.prepareStatement(sql);
//
//            preparedStatement.execute();
//
//            System.out.println("done...");
//
//        } catch (Exception e) {
//
//            e.printStackTrace();
//
//        } finally {
//
//            // close connection, statement, preparedStatement, resultSet
//        }

//        try {
//
//            connection = XJdbc.openConnection();
//            System.out.println("Connected...");
//
//            String sql = """
//                            INSERT INTO students(id, name, email, phone)
//                            VALUES(?, ?, ?, ?);
//                         """;
//
//            preparedStatement = connection.prepareStatement(sql);
//
//            // set values for preparedStatement
//            preparedStatement.setInt(1, 1003);
//            preparedStatement.setString(2, "Student 3");
//            preparedStatement.setString(3, "Email 3");
//            preparedStatement.setString(4, "Phone 3");
//
//            preparedStatement.execute();
//
//            System.out.println("done...");
//
//        } catch (Exception e) {
//
//            e.printStackTrace();
//
//        } finally {
//
//            // close connection, statement, preparedStatement, resultSet
//        }

//        try {
//
//            connection = XJdbc.openConnection();
//            System.out.println("Connected...");
//
//            String sql = """
//                            SELECT * FROM students;
//                         """;
//
//            statement = connection.createStatement();
//
//            resultSet = statement.executeQuery(sql);
//
//            while (resultSet.next()) {
//                System.out.println("Student Id: " + resultSet.getInt("id"));
//                System.out.println("Student Name: " + resultSet.getString("name"));
//                System.out.println("Student Email: " + resultSet.getString("email"));
//                System.out.println("Student Phone: " + resultSet.getString("phone"));
//            }
//
//
//            System.out.println("done...");
//
//        } catch (Exception e) {
//
//            e.printStackTrace();
//
//        } finally {
//            // close connection, prepatedStatement, resulSet
//        }


//        try {
//
//            connection = XJdbc.openConnection();
//            System.out.println("Connected...");
//
//            String sql = """
//                            SELECT * FROM students WHERE id = ?;
//                         """;
//
//            preparedStatement = connection.prepareStatement(sql);
//
//            preparedStatement.setInt(1, 1001);
//
//            resultSet = preparedStatement.executeQuery();
//
//            while (resultSet.next()) {
//                System.out.println("Student Id: " + resultSet.getInt("id"));
//                System.out.println("Student Name: " + resultSet.getString("name"));
//                System.out.println("Student Email: " + resultSet.getString("email"));
//                System.out.println("Student Phone: " + resultSet.getString("phone"));
//            }
//
//
//            System.out.println("done...");
//
//        } catch (Exception e) {
//
//            e.printStackTrace();
//
//        } finally {
//            // close connection, prepatedStatement, resulSet
//        }

        try {

            connection = XJdbc.openConnection();
            System.out.println("Connected...");

            String sql = """
                            UPDATE students
                            SET name = ?, email = ?, phone = ?
                            WHERE id = ?;
                         """;

            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, "Student 11");
            preparedStatement.setString(2, "Email 11");
            preparedStatement.setString(3, "Phone 11");
            preparedStatement.setInt(4, 1001);

            preparedStatement.executeUpdate();


            System.out.println("done...");

        } catch (Exception e) {

            e.printStackTrace();

        } finally {
            // close connection, prepatedStatement, resulSet
        }




    }
}
