package com.example.school.mapper;

import com.example.school.dto.StudentDTO;
import com.example.school.model.Student;
import org.mapstruct.Mapper;

@Mapper
public interface StudentMapper {
    Student mapToStudent(StudentDTO studentDTO);
}
