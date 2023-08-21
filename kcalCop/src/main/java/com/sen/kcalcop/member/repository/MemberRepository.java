package com.sen.kcalcop.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sen.kcalcop.member.entity.Member;

public interface MemberRepository extends JpaRepository<Member, String> {

}
