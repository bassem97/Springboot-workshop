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
        if(studentRepository.findById(id).isPresent() ){
            Student toUpdateStudent = studentRepository.findById(id).get();
            toUpdateStudent.setFirstName(student.getFirstName());
            toUpdateStudent.setLastName(student.getLastName());
            toUpdateStudent.setEmail(student.getEmail());
            toUpdateStudent.setGender(student.getGender());
            return studentRepository.save(toUpdateStudent);
        }
        return null;
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id).get();
    }
}
