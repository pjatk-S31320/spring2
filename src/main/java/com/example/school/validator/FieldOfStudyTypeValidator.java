package com.example.school.validator;

import com.example.school.repository.FieldOfStudyTypeRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class FieldOfStudyTypeValidator implements ConstraintValidator<ValidateFieldOfStudyType, String> {

    private static FieldOfStudyTypeRepository fieldOfStudyTypeRepository;

    public static void setRepository(FieldOfStudyTypeRepository repo) {
        fieldOfStudyTypeRepository = repo;
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return fieldOfStudyTypeRepository.existsByNameIgnoreCase(s);
    }
}
