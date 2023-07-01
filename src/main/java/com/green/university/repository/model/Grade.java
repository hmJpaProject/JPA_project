package com.green.university.repository.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Grade {

    // 학점 (평점)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 2)
    private String grade;

    // 환산 점수
    @Column(nullable = false)
    private Float gradeValue;
}
