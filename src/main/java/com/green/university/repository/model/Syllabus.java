package com.green.university.repository.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Syllabus {

    @Id
    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    // 수업 개요
    @Column
    private String overview;

    // 강의 목표
    @Column
    private String objective;

    // 교재
    @Column
    private String textbook;

    @Column
    @Lob
    private String program;

}
