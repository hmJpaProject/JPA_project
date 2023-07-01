package com.green.university.repository.model;

import lombok.Data;

import javax.persistence.*;

// 사용자
@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 255)
    private String password;

    @Column(nullable = false, length = 10)
    private String userRole;

}
