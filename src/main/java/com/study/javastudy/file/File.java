package com.study.javastudy.file;

import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
public class File {
    // 인덱스
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long filesIdx;
    // 파일 이름
    private String originalName;
    // 파일 경로
    private String filePath;
    // 파일크기 (바이트)
    private Long fileSize;
    // MIME 타입
    private String fileType;
    // 업로드일시
    private LocalTime uploadAt;
    // 유저 인덱스
    private Long userIdx;
}
