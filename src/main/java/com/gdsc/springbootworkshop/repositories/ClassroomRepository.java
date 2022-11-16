package com.gdsc.springbootworkshop.repositories;

import com.gdsc.springbootworkshop.entites.Classroom;
import com.gdsc.springbootworkshop.entites.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassroomRepository extends JpaRepository<Classroom, Long> {

    Classroom findByName(String name);
}
