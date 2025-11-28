package com.example.school.controller;

import com.example.school.dto.StudentDTO;
import com.example.school.model.Student;
import com.example.school.service.StudentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/student")
@RestController
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;


    @GetMapping
    public List<Student> getAll() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @PostMapping
    public void addStudent(@RequestBody @Valid StudentDTO studentdto) {
        studentService.addStudent(studentdto);
    }

    @PutMapping("/{id}")
    public void updateStudent(@PathVariable Long id, @RequestBody Student student) {
        studentService.updateStudent(id, student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }
}
