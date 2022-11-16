package com.gdsc.springbootworkshop.services;

import com.gdsc.springbootworkshop.entites.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {


    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    @Override
    public Student addStudent(Student student) {
        return null;
    }

    @Override
    public Student updateStudent(Long id, Student student) {
        return null;
    }

    @Override
    public void deleteStudent(Long id) {

    }

    @Override
    public Student findById(Long id) {
        return null;
    }
}
