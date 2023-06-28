package com.green.university.repository.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StuSchTb {

    @Id
    private Integer studentId;

    // 지원 연도
    @Column(nullable = false)
    private Integer schYear;

    // 지원 학기
    @Column(nullable = false)
    private Integer semester;

    // 장학금 유형
    private Integer schType

}
