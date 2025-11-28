package com.example.school.service;

import com.example.school.dto.StudentDTO;
import com.example.school.mapper.StudentMapper;
import com.example.school.model.Student;
import com.example.school.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(RuntimeException::new);
    }

    public Student addStudent(StudentDTO studentDTO) {
        Student student = studentMapper.mapToStudent(studentDTO);
        return studentRepository.save(student);
    }

    public Student updateStudent(Long id, Student updateStudent) {
        Student student = getStudentById(id);

        student.setName(updateStudent.getName());
        student.setSurname(updateStudent.getSurname());
        student.setIndex(updateStudent.getIndex());
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        Student student = getStudentById(id);
        studentRepository.delete(student);
    }
}
