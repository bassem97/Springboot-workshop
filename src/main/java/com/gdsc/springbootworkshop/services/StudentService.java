package com.gdsc.springbootworkshop.services;

import com.gdsc.springbootworkshop.entites.Student;
import com.gdsc.springbootworkshop.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student addStudent(Student student) throws Exception {
        if(studentRepository.findByEmail(student.getEmail()) != null)
            throw new Exception("Student already exists");
        return studentRepository.save(student);
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
