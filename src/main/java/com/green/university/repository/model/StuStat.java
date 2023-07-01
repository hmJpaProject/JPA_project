package com.green.university.repository.model;

import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.sql.Date;

// 학적 상태
@Entity
@Data
public class StuStat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @Column(nullable = false)
    private Student student;

    // 재학, 휴학, 졸업, 자퇴
    @Column(nullable = false, length = 3)
    @ColumnDefault("재학")
    private String status;

    @Column
    private Date fromDate;

    @Column
    private Date toDate;

}
