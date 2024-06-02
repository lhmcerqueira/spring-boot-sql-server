package org.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.*;

@Data
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.PROTECTED)
    private Long id;
    private String name;
    private int age;
    private String gender;
    private String nationality;

    public User(String name, int age, String gender, String nationality) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.nationality = nationality;
    }
}
