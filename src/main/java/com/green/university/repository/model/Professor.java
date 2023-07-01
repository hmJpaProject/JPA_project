package com.green.university.repository.model;

import lombok.Data;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.sql.Date;

// 교수
@Entity
@Data
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 30)
    private String name;

    @CreatedDate
    @Column(nullable = false)
    private Date birthDate;

    @Column(nullable = false, length = 1)
    private String gender;

    @Column(nullable = false, length = 100)
    private String address;

    @Column(nullable = false, length = 13)
    private String tel;

    @Column(nullable = false, length = 20)
    private String email;

    // 교수 : 학과 = N : 1
    @ManyToOne
    @JoinColumn(name="dept_id")
    private Department dept;

    @ColumnDefault("'current_date'")
    @CreatedDate
    private String hireDate;
}
