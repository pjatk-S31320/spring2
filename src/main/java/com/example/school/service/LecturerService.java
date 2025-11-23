package com.example.school.service;

import com.example.school.model.Lecturer;
import com.example.school.repository.LecturerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LecturerService {
    private final LecturerRepository lecturerRepository;

    public List<Lecturer> getLecturers() {
        return lecturerRepository.findAll();
    }

    public Lecturer getById(Long id) {
        return lecturerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException());
    }

    public Lecturer addLecturer(Lecturer lecturer) {
        return lecturerRepository.save(lecturer);
    }

    public Lecturer updateLecturer(Long id, Lecturer updatedLecturer) {
        Lecturer lecturer = getById(id);

        lecturer.setName(updatedLecturer.getName());
        lecturer.setSurname(updatedLecturer.getSurname());

        return lecturerRepository.save(lecturer);
    }

    public void deleteLecturer(Long id) {
        lecturerRepository.deleteById(id);
    }
}
