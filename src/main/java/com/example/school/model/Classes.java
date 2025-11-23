package com.example.school.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Classes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameClasses;


    @OneToMany(mappedBy = "classes", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Student> students = new ArrayList<>();

   @ManyToOne
   @JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "classes"})
    private Lecturer lecturer;

}
