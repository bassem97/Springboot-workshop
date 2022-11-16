package com.gdsc.springbootworkshop.services;

import com.gdsc.springbootworkshop.entites.Student;

import java.util.List;

public interface IStudentService {

    List<Student> getAllStudents();
    Student addStudent(Student student) throws Exception;
    Student updateStudent(Long id,Student student);
    void deleteStudent(Long id);
    Student findById(Long id);
}
