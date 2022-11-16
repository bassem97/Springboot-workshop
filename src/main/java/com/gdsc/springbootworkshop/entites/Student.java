package com.gdsc.springbootworkshop.entites;


import javax.persistence.*;

@Entity
public class Student {


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
        return idStudent;
    }

    public void setId(Long id) {
        this.idStudent = id;
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
