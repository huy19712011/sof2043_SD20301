package com.mycompany.sof2043_sd20301.dao;

import com.mycompany.sof2043_sd20301.entity.Student;
import com.mycompany.sof2043_sd20301.util.XJdbc;
import com.mycompany.sof2043_sd20301.util.XQuery;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {

    public List<Student> getAll() throws SQLException {

        String sql = "SELECT * FROM students;";

        return XQuery.getBeanList(Student.class, sql);


    }
}
