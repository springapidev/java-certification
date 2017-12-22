package com.coderbd.dao;

import com.coderbd.domain.Student;
import java.util.List;

public interface StudentDao {
 public void save(Student s);
 public void update(Student s);
 public void delete(int id);
 public Student getStudent(int id);
 public List<Student> getStudents();
}
