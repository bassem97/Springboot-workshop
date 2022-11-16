package com.gdsc.springbootworkshop.repositories;

import com.gdsc.springbootworkshop.entites.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
