package com.gdsc.springbootworkshop.services.student;

import com.gdsc.springbootworkshop.entites.Student;

import java.util.List;

public interface IStudentService {

    Student findById(Long id);
}
