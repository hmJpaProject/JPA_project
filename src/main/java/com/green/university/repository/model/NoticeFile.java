package com.green.university.repository.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class NoticeFile {

    @Id
    @ManyToOne
    @JoinColumn(name = "notice_id")
    private Notice notice;

    // 기존 파일명
    @Column(nullable = false)
    private String originFilename;

    // 랜덤 문자열 포함 파일명
    @Column(nullable = false)
    private String uuidFilename;

}
