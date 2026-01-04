package com.skillnext1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.skillnext1.Student;

public class StudentDAO {

    public static void save(Student stu) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/skillnext_db",
                "root",
                "Karthik@2106"
            );

            String sql = "INSERT INTO employee(name,Sem,dept) VALUES(?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, stu.getName());
            ps.setString(2, stu.getSem());
            ps.setString(3, stu.getdept());

            ps.executeUpdate();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
