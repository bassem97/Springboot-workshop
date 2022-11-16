package com.gdsc.springbootworkshop.services.student;

import com.gdsc.springbootworkshop.entites.Classroom;
import com.gdsc.springbootworkshop.entites.Student;
import com.gdsc.springbootworkshop.repositories.StudentRepository;
import com.gdsc.springbootworkshop.services.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService , ICrudService<Student,Long> {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student add(Student student) throws Exception {
        if(studentRepository.findByEmail(student.getEmail()) != null)
            throw new Exception("Student already exists");
        return studentRepository.save(student);
    }

    @Override
    public Student update(Long id, Student student) {
        if(studentRepository.findById(id).isPresent()){
            Student toUpdateStudent = studentRepository.findById(id).get();
            toUpdateStudent.setFirstName(student.getFirstName());
            toUpdateStudent.setLastName(student.getLastName());
            toUpdateStudent.setEmail(student.getEmail());
            toUpdateStudent.setGender(student.getGender());
            toUpdateStudent.setClassroom(student.getClassroom());
            return studentRepository.save(toUpdateStudent);
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id).get();
    }
}
