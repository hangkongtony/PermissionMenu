package com.penghk.learn.service.impl;

import com.penghk.learn.dao.MemberDao;
import com.penghk.learn.domain.Member;
import com.penghk.learn.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberDao memberDao;
    @Override
    public List<Member> getAllMember() {
        return memberDao.getAllMember();
    }

    @Override
    public List<Member> getQueryMember(Member member) {
        return memberDao.getQueryMember(member);
    }

    @Override
    public boolean deleteMember(Member member) {
        return memberDao.deleteMember(member);
    }

    @Override
    public boolean saveMember(Member member) {
        return memberDao.saveMember(member);
    }

    @Override
    public boolean updateMember(Member member) {
        return memberDao.updateMember(member);
    }
}
