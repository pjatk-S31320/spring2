package com.example.school.service;

import com.example.school.model.Classes;
import com.example.school.repository.ClassesRepository;
import com.example.school.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClassesService {
    private final ClassesRepository classesRepository;
    private final StudentRepository studentRepository;

    public List<Classes> getClasses() {
        return classesRepository.findAll();
    }

    public Classes getById(Long id) {
        return classesRepository.findById(id)
                .orElseThrow(() -> new RuntimeException());
    }

    public Classes addClass(Classes classes) {
        Classes saved = classesRepository.save(classes);

        classes.getStudents().forEach(s -> {
            s.setClasses(saved);
            studentRepository.save(s);
        });

        return saved;
    }

    public Classes updateClass(Long id, Classes updatedClass) {
        Classes classes = getById(id);

        classes.setNameClasses(updatedClass.getNameClasses());
        classes.setLecturer(updatedClass.getLecturer());
        classes.setStudents(updatedClass.getStudents());


        return classesRepository.save(classes);
    }

    public void deleteClass(Long id) {
        classesRepository.deleteById(id);

    }

}


