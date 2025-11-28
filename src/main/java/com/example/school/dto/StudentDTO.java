package com.example.school.dto;

import com.example.school.model.Classes;
import com.example.school.validator.ValidateFieldOfStudyType;
import lombok.Data;

@Data
public class StudentDTO {

    private String name;
    private String surname;
    private int index;
    private Classes classes;

    @ValidateFieldOfStudyType
    private String fieldOfStudy;
}
