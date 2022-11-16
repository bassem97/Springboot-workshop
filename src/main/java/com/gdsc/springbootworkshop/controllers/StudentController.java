package com.gdsc.springbootworkshop.controllers;

import com.gdsc.springbootworkshop.entites.Student;
import com.gdsc.springbootworkshop.services.StudentService;
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
        return studentService.getAllStudents();
    }

    @PostMapping("")
    Student  addStudent(@RequestBody Student student) throws Exception {
        return studentService.addStudent(student);
    }



}
