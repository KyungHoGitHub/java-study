package com.study.javastudy.devstack;

import com.study.javastudy.user.Users;
import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
public class Devstack {
    // 인덱스
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long devStackIdx;
    // ex) 리액트
    private String name;
    private String description;
    // 생성자 유저 인덱스
    private Long createUserIdx;
    // 생성일
    private LocalTime createAt;
    // 수정일
    private LocalTime updateAt;

    // 유저테이블
    @ManyToOne
    @JoinColumn(name = "user_idx")
    private Users users;
}
