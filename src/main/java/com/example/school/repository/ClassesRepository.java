package com.example.school.repository;

import com.example.school.model.Classes;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClassesRepository extends JpaRepository<Classes, Long> {
    @EntityGraph(attributePaths = {"students"})
    @Override
    List<Classes> findAll();
}


