package com.example.school.repository;

import com.example.school.model.FieldOfStudyType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FieldOfStudyTypeRepository extends JpaRepository<FieldOfStudyType, Long> {

    boolean existsByNameIgnoreCase(String name);
}
