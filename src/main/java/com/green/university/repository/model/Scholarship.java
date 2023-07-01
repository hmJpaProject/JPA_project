package com.green.university.repository.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Scholarship {

    // 장학금 유형
    @Id
    private Integer type;

    // 최대 지원 금액
    @Column(nullable = false)
    private Integer maxAmount;

}
