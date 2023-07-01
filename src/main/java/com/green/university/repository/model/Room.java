package com.green.university.repository.model;

import lombok.Data;

import javax.persistence.*;

// 강의실
@Entity
@Data
public class Room {

    @Id
    @Column(length = 5)
    private String id;

    // 강의실 : 단과대 = N : 1
    @ManyToOne
    @JoinColumn(name = "college_id")
    private College college;

}
