package com.gdsc.springbootworkshop.entites;

import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
public class Student {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idStudent;
    private String firstName;
    private String lastName;

    @Column(unique = true)
    private String email;

    @Enumerated(EnumType.STRING)
    private GENDER gender;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student() {
    }

    public Student(String firstName, String lastName, String email, GENDER gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    }
}
