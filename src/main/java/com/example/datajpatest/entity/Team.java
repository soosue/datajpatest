package com.example.datajpatest.entity;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@SequenceGenerator(name = "bb")
public class Team {

    public Team(String teamName) {
        this.teamName = teamName;
    }

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bb")
    private Long id;

    private String teamName;


}
