package com.study.javastudy.user;

import com.study.javastudy.devstack.Devstack;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

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
    private Long userIdx;
    // 아이디
    private String id;
    // 패스워드
    private String password;
    // 이메일
    private String email;
    // 이름
    private String name;
    // 나이
    private Integer age;
    // 생성일
    private LocalTime createAt;
    // 수정일
    private LocalTime updateAt;
    // 기술스택
    @OneToMany(mappedBy = "users")
    private List<Devstack> devStackList = new ArrayList<>();

}