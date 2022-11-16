package com.gdsc.springbootworkshop.controllers;

import com.gdsc.springbootworkshop.entites.Student;
import com.gdsc.springbootworkshop.services.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {

    @Autowired
    StudentService  studentService;

    @GetMapping("")
    List<Student> findAllStudents(){
        return studentService.getAll();
    }

    @PostMapping("")
    Student  addStudent(@RequestBody Student student) throws Exception {
        return studentService.add(student);
    }

    @PutMapping("/{id}")
    Student updateStudent(@PathVariable("id") Long id, @RequestBody Student student){
        return studentService.update(id, student);
    }

    @DeleteMapping("/{id}")
    void deleteStudent(@PathVariable("id") Long id){
        studentService.delete(id);
    }

    @GetMapping("/{id}")
    Student findById(@PathVariable("id") Long id){
        return studentService.findById(id);
    }






}
