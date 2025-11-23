package com.example.school.controller;

import com.example.school.model.Lecturer;
import com.example.school.service.LecturerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/lecturer")
public class LecturerController {
    private final LecturerService lecturerService;

    @GetMapping
    public List<Lecturer> getAll() {
        return lecturerService.getLecturers();
    }

    @GetMapping("/{id}")
    public Lecturer getLecturers(@PathVariable Long id) {
        return lecturerService.getById(id);
    }

    @PostMapping
    public void addLecturers(@RequestBody Lecturer lecturer) {
        lecturerService.addLecturer(lecturer);
    }

    @PutMapping("/{id}")
    public void updateLecturers(@PathVariable Long id, @RequestBody Lecturer lecturer) {
        lecturerService.updateLecturer(id, lecturer);
    }

    @DeleteMapping("/id")
    public void deleteLecturers(@PathVariable Long id) {
        lecturerService.deleteLecturer(id);
    }

}
