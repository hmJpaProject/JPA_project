package com.green.university.repository.model;

import lombok.Data;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.sql.Date;

// 교직원
@Entity
@Data
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 30)
    private String name;

    @CreatedDate
    @Column(nullable = false)
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

    // 오류 예상
    // 고용일
    @ColumnDefault("'current_date'")
    @CreatedDate
    private Date hireDate;
}
