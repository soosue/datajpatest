package com.example.datajpatest.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@SequenceGenerator(name = "aa", allocationSize = 30)
public class Member {

    public Member(String name) {
        this.name = name;
    }

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aa")
    private Long id;

    private String name;
}

