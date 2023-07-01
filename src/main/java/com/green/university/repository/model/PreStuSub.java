package com.green.university.repository.model;

import lombok.Data;

import javax.persistence.*;

// 오류 예상
// 수강 신청
@Entity
@Data
public class PreStuSub {
    
    @Id
    // 수강 신청 : 학생 = N : 1
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @Id
    // 수강 신청 : 과목 = N : 1
    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;
}
