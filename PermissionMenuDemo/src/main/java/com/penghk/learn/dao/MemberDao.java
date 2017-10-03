package com.penghk.learn.dao;

import com.penghk.learn.domain.Member;

import java.util.List;

public interface MemberDao {
    public List<Member> getAllMember();

    public List<Member> getQueryMember(Member member);

    boolean deleteMember(Member member);

    boolean saveMember(Member member);

    boolean updateMember(Member member);
}
