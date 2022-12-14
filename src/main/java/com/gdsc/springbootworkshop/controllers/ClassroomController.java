package com.gdsc.springbootworkshop.controllers;

import com.gdsc.springbootworkshop.entites.Classroom;
import com.gdsc.springbootworkshop.entites.Student;
import com.gdsc.springbootworkshop.services.classroom.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("classrooms")
public class ClassroomController {

    @Autowired
    ClassroomService classroomService;


    @GetMapping("")
    List<Classroom> findAllClassrooms(){
        return classroomService.getAll() ;
    }

    @PostMapping("")
    Classroom addClassroom(@RequestBody Classroom classroom) throws Exception {
        return classroomService.add(classroom);
    }

    @PutMapping("/{id}")
   Classroom updateClassroom(@PathVariable("id") Long id,@RequestBody Classroom classroom) throws Exception {
        return classroomService.update(id,classroom);
    }

    @DeleteMapping("/{id}")
    void deleteStudent(@PathVariable("id") Long id){
       classroomService.delete(id);
    }

    @GetMapping("/{id}")
   Classroom findById(@PathVariable("id") Long id){
        return classroomService.findById(id);
    }

//    @GetMapping("findStudentsByClassroomName/{name}")
//    public List<Student> getStudentsByClassroomName(@PathVariable("name") String name) {
//        return classroomService.getStudentsByClassroomName(name);
//    }


}
