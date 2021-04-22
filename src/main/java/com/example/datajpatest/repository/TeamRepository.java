package com.example.datajpatest.repository;

import com.example.datajpatest.entity.Member;
import com.example.datajpatest.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
}
