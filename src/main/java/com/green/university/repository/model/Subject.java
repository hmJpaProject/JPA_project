package com.green.university.repository.model;

import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

// 강의
@Entity
@Data
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 20)
    private String name;

    // 강의 : 교수 = N : 1
    @ManyToOne
    @JoinColumn(name = "professor_id")
    @Column(nullable = false)
    private Professor professor;

    // 강의 : 강의실 = N : 1
    @ManyToOne
    @JoinColumn(name = "room_id")
    @Column(length = 5)
    private Room room;

    // 강의 : 학과 = N : 1
    @ManyToOne
    @Column(nullable = false)
    private Department dept;

    // 강의 구분 (전공, 교양)
    @Column(nullable = false, length = 2)
    private String type;

    // 연도
    @Column(nullable = false)
    private Integer subYear;

    // 학기
    @Column(nullable = false)
    private Integer semester;

    // 요일
    @Column(nullable = false, length = 1)
    private String subDay;

    // 시작 시간
    @Column(nullable = false)
    private Integer startTime;

    // 종료 시간
    @Column(nullable = false)
    private Integer endTime;

    // 이수 학점
    @Column(nullable = false)
    private Integer grades;

    // 수강 정원
    @Column(nullable = false)
    private Integer capacity;

    // 현재 신청 인원
    @Column(nullable = false)
    @ColumnDefault("0")
    private Integer numOfStudent;

}
