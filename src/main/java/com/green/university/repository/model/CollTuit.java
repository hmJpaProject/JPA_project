package com.green.university.repository.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class CollTuit {

    @Id
    @ManyToOne
    @JoinColumn(name = "college_id")
    private College college;

    @Column(nullable = false)
    private Integer amount;

}
