package com.green.university.repository.model;

import javax.persistence.*;

@Entity
public class CollTuitTb {

    @Id
    @ManyToOne
    @JoinColumn(name = "college_id")
    private College college;

    @Column(nullable = false)
    private Integer amount;

}
