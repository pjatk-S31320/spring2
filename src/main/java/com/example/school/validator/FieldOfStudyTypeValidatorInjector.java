package com.example.school.validator;

import com.example.school.repository.FieldOfStudyTypeRepository;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Component
@Transactional(readOnly = true)
public class FieldOfStudyTypeValidatorInjector {

    private final FieldOfStudyTypeRepository fieldOfStudyTypeRepository;

    @PostConstruct
    public void init() {
        FieldOfStudyTypeValidator.setRepository(fieldOfStudyTypeRepository);
    }
}
