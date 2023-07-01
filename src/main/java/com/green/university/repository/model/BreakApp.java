package com.green.university.repository.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
public class BreakApp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @Column(nullable = false)
    @JoinColumn(name = "student_id")
    private Student student;

    @Column(nullable = false)
    private Integer studentGrade;

    @Column(nullable = false)
    private Integer fromYear;

    @Column(nullable = false)
    private Integer fromSemester;

    // 일반, 임신·출산·육아, 질병, 창업, 군입대
    @Column(nullable = false, length = 10)
    private String type;

    @Column(nullable = false, columnDefinition = "Date default current_date")
    private Date appDate;
    
    // 처리중, 승인, 거부
    @Column(nullable = false, length = 3, columnDefinition = "처리중")
    private String status;

}
