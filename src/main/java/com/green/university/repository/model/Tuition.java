package com.green.university.repository.model;

import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

// 등록금
@Entity
@Data
public class Tuition {

    // 등록금 : 학생 -> Many to one
    @Id
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    // 등록 연도
    @Id
    @Column(nullable = false)
    private Integer tuiYear;

    // 등록 학기
    @Id
    @Column(nullable = false)
    private Integer semester;

    // 등록금
    @Column(nullable = false)
    private Integer tuiAmount;

    // 장학금 유형
    @Column
    @ManyToOne
    @JoinColumn(name = "sch_type")
    private Scholarship schType;

    // 장학금
    @Column
    private Integer schAmount;

    // 납부여부
    @Column(columnDefinition = "Boolean default false")
    private Boolean status;
}
