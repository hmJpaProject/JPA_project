package com.green.university.repository.model;

import javax.persistence.*;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 10, unique = true)
    private String name;

    // Department : College = N : 1
    @ManyToOne
    @JoinColumn(name = "college_id")
    private College collegeId;

}
