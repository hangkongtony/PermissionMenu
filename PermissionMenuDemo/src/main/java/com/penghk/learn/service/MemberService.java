package com.penghk.learn.service;

import com.penghk.learn.domain.Member;

import java.util.List;

public interface MemberService {
    public List<Member> getAllMember();

    List<Member> getQueryMember(Member member);

    boolean deleteMember(Member member);

    boolean saveMember(Member member);

    boolean updateMember(Member member);
}
