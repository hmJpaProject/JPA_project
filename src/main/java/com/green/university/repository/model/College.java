package com.green.university.repository.model;

import javax.persistence.*;

@Entity
public class College {

    // id를 입력하지 않을 경우 자동 AUTO_INCREMENT
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 10, unique = true)
    private String name;

}
