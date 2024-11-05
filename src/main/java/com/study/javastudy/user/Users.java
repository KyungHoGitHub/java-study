package com.study.javastudy.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

// 유저테이블
@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class Users {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idx;
    // 이름
    private String name;
    // 나이
    private Integer age;
}