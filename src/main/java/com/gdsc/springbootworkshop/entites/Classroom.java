package com.gdsc.springbootworkshop.entites;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idClassroom;

    @Column(unique = true)
    private String name;

    @OneToMany()
    @JoinColumn(name = "idClassroom")
    List<Student> students;
}
