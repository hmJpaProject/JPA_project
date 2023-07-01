package com.green.university.repository.model;

import lombok.Data;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.sql.Date;

// 학생
@Entity
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // 학번

    @Column(nullable = false, length = 30)
    private String name;

    @Column(nullable = false)
    @CreatedDate
    private Date birthDate;

    // 남자 : M, 여자 : F
    @Column(nullable = false, length = 1)
    private String gender;

    @Column(nullable = false, length = 100)
    private String address;

    @Column(nullable = false, length = 13)
    private String tel;

    @Column(nullable = false, length = 20)
    private String email;

    // 학과
    // 학생 : 학과 = N : 1
    @ManyToOne
    @JoinColumn(name = "dept_id")
    @Column(nullable = false)
    private Department dept;

    // 학년
    @Column(nullable = false)
    @ColumnDefault("1") // default 1
    private Integer grade;

    // 학기
    @Column(nullable = false)
    @ColumnDefault("1")
    private Integer semester;

    // 등록일
    @Column(nullable = false)
    @CreatedDate
    private Date entranceDate;

    // 졸업일
    @CreatedDate
    private Date graduationDate;

}
