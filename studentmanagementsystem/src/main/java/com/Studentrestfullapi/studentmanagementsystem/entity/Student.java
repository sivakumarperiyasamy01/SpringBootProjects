package com.Studentrestfullapi.studentmanagementsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Student {
    @Id  // tell spring creat id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // that id should be unique
    private int id;
    private String name;
    private String email;
    private int age;

}
