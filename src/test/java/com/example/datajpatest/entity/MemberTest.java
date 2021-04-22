package com.example.datajpatest.entity;

import com.example.datajpatest.repository.MemberRepository;
import com.example.datajpatest.repository.TeamRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberTest {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    EntityManager em;

    @Test
    void sqlQueryTest() {
        List<Member> members = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            Member member = new Member("A" + i);
            members.add(member);
        }
        memberRepository.saveAll(members);

        List<Team> teams = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Team team = new Team("T" + i);
            teams.add(team);
        }
        teamRepository.saveAll(teams);

        teams.clear();
        for (int i = 0; i < 10; i++) {
            Team team = new Team("T" + i);
            teams.add(team);
        }
        teamRepository.saveAll(teams);


        members.clear();
        for (int i = 50; i < 150; i++) {
            Member member = new Member("A" + i);
            members.add(member);
        }
        memberRepository.saveAll(members);

    }
    @Test
    void sqlQueryTest2() {
        List<Member> members = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            Member member = new Member("A" + i);
            members.add(member);
        }
        memberRepository.saveAll(members);

        List<Team> teams = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Team team = new Team("T" + i);
            teams.add(team);
        }
        teamRepository.saveAll(teams);

        teams.clear();
        for (int i = 0; i < 10; i++) {
            Team team = new Team("T" + i);
            teams.add(team);
        }
        teamRepository.saveAll(teams);


        members.clear();
        for (int i = 50; i < 150; i++) {
            Member member = new Member("A" + i);
            members.add(member);
        }
        memberRepository.saveAll(members);

    }
}