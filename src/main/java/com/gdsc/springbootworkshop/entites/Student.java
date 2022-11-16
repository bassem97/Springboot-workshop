package com.gdsc.springbootworkshop.entites;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
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

    public Student(String firstName, String lastName, String email, GENDER gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    }
}
