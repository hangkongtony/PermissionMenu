package com.penghk.learn.dao.impl;

import com.penghk.learn.dao.MemberDao;
import com.penghk.learn.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MemberDaoImpl implements MemberDao {

    @Autowired
    SqlMapClientTemplate sqlMapClientTemplate;
    @Override
    public List<Member> getAllMember() {
        return sqlMapClientTemplate.queryForList("getAllMember");
    }

    @Override
    public List<Member> getQueryMember(Member member) {
        return sqlMapClientTemplate.queryForList("getQueryMember",member);
    }

    @Override
    public boolean deleteMember(Member member) {
        int delNum =  sqlMapClientTemplate.delete("deleteMember",member);
        if(delNum>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean saveMember(Member member) {
        return false;
    }


    @Override
    public boolean updateMember(Member member) {
        int updateCount = sqlMapClientTemplate.update("updateMember" , member);
        if(updateCount>0){
            return true;
        }
        return false;
    }
}
