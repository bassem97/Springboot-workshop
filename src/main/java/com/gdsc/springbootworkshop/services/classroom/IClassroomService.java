package com.gdsc.springbootworkshop.services.classroom;

import com.gdsc.springbootworkshop.entites.Classroom;

import java.util.List;

public interface IClassroomService {

    Classroom findById(Long id);
}
