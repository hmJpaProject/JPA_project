package com.green.university.repository.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class StuSubDetail {

    @Id
    @ManyToOne
    @JoinColumn(name = "id")
    private StuSub id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    // 결석 횟수
    @Column
    private Integer absent;

    // 지각 횟수
    @Column
    private Integer lateness;

    // 과제 점수
    @Column
    private Integer homework;

    // 중간고사 점수
    @Column
    private Integer midExam;

    // 기말고사 점수
    @Column
    private Integer finalExam;

    // 환산 점수
    @Column
    private Integer convertedMark;

}
