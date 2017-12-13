package com.coderbd.service;

import com.coderbd.connection.DbConnection;
import com.coderbd.dao.StudentDao;
import com.coderbd.domain.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentService implements StudentDao {

    Connection conn = DbConnection.getConnections();

    @Override
    public void save(Student s) {
        try {
            if (s.getName() != null) {
                PreparedStatement pstm = conn.prepareStatement("insert into student(name) values(?)");
                pstm.setString(1, s.getName());
                int i = pstm.executeUpdate();
                System.out.println(i + " Data Inserted Successfully");
            }
        } catch (Exception e) {
        }
    }

    @Override
    public void update(Student s) {
        try {
            if (s.getId() != 0) {
                PreparedStatement pstm = conn.prepareStatement("update student set name=? where id=?");
                pstm.setString(1, s.getName());
                pstm.setInt(2, s.getId());
                int i = pstm.executeUpdate();
                System.out.println(i + " Data Updated Successfully");
            }
        } catch (Exception e) {
        }
    }

    @Override
    public void delete(int id) {
        try {
            if (id != 0) {
                PreparedStatement pstm = conn.prepareStatement("delete from student where id=?");
                pstm.setInt(1, id);
                int i = pstm.executeUpdate();
                System.out.println(i + " Data Deleted Successfully");
            }
        } catch (Exception e) {
        }
    }

    @Override
    public Student getStudent(int id) {
        Student student = null;
        try {
            PreparedStatement pstm = conn.prepareStatement("select * from student where id=?");
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                // student = new Student(rs.getInt(1), rs.getString(2));
                student = new Student();
                student.setId(rs.getInt(1));
                student.setName(rs.getString(2));
            }

        } catch (Exception e) {
        }
        return student;
    }

    @Override
    public List<Student> getStudents() {
       List<Student> students = new ArrayList<>();
       Student student = null;
        try {
            PreparedStatement pstm = conn.prepareStatement("select * from student");
                 ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                // student = new Student(rs.getInt(1), rs.getString(2));
                student = new Student();
                student.setId(rs.getInt(1));
                student.setName(rs.getString(2));
                students.add(student);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
       
       return students;
    }

}
