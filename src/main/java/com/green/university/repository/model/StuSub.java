package com.green.university.repository.model;

import lombok.Data;

import javax.persistence.*;

// 수강 내역
@Entity
@Data
public class StuSub {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // 수강 내역 : 학생 = N : 1
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    // 수강 내역 : 과목 = N : 1
    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    // 수강 내역 : 환산 점수 = N : 1
    @ManyToOne
    @JoinColumn(name = "grade")
    private Grade grade;

}
