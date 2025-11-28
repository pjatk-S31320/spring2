package com.example.school.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
@Constraint(validatedBy = FieldOfStudyTypeValidator.class)

public @interface ValidateFieldOfStudyType {
    String message() default "Value not allowed for fieldOfStudyType";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
