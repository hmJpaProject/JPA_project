package com.green.university.repository.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class StuSchTb {

    @Id
    private Integer studentId;

    // 지원 연도
    @Id
    @Column(nullable = false)
    private Integer schYear;

    // 지원 학기
    @Id
    @Column(nullable = false)
    private Integer semester;

    // 장학금 유형
    // N : 1 관계
    @Column
    @ManyToOne
    @JoinColumn(name = "sch_type")
    private Scholarship schType;

}
