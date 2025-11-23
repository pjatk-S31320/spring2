package com.example.school.controller;

import com.example.school.model.Classes;
import com.example.school.service.ClassesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/classes")
public class ClassesController {
    private final ClassesService classesService;

    @GetMapping
    public List<Classes> getAll() {
        return classesService.getClasses();
    }

    @GetMapping("/{id}")
    public Classes findById(@PathVariable Long id) {
        return classesService.getById(id);
    }

    @PostMapping
    public void save(@RequestBody Classes classes) {
        classesService.addClass(classes);
    }

    @PutMapping("/{id}")
    public Classes update(@PathVariable Long id, @RequestBody Classes classes) {
        return classesService.updateClass(id, classes);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        classesService.deleteClass(id);
    }

}
