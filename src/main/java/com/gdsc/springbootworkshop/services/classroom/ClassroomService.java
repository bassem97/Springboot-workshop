package com.gdsc.springbootworkshop.services.classroom;

import com.gdsc.springbootworkshop.entites.Classroom;
import com.gdsc.springbootworkshop.repositories.ClassroomRepository;
import com.gdsc.springbootworkshop.services.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassroomService implements IClassroomService, ICrudService<Classroom,Long> {

    @Autowired
    private ClassroomRepository studentRepository;

    @Override
    public List<Classroom> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Classroom add(Classroom classroom) throws Exception {
        if(studentRepository.findByName(classroom.getName()) != null)
            throw new Exception("Classroom already exists");
        return studentRepository.save(classroom);
    }

    @Override
    public Classroom update(Long id, Classroom classroom) {
        if(studentRepository.findById(id).isPresent()){
            Classroom toUpdateClassroom = studentRepository.findById(id).get();
            toUpdateClassroom.setName(classroom.getName());
            return studentRepository.save(toUpdateClassroom);
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Classroom findById(Long id) {
        return studentRepository.findById(id).get();
    }
}
