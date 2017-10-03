package com.penghk.learn.domain;

import java.util.Date;

public class Member {

    private Integer id;
    /**
     * 会员号
     */
    private String memberNo;
    /**
     * 会员名
     */
    private String memberName;
    /**
     * 会员照片
     */
    private String photo;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 身份证
     */
    private String idCard;
    /**
     * 登录时间
     */
    private Date loginTime;

    /**
     * 地址
     */
    private String address;

    /**
     * 学历
     */
    private String educateGrade;
    /**
     * 备注
     */
    private String remark;

    public Member() {
    }

    public Member(Integer id, String memberNo, String memberName, String photo, Integer age, String idCard, Date loginTime, String address, String educateGrade, String remark) {
        this.id = id;
        this.memberNo = memberNo;
        this.memberName = memberName;
        this.photo = photo;
        this.age = age;
        this.idCard = idCard;
        this.loginTime = loginTime;
        this.address = address;
        this.educateGrade = educateGrade;
        this.remark = remark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(String memberNo) {
        this.memberNo = memberNo;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEducateGrade() {
        return educateGrade;
    }

    public void setEducateGrade(String educateGrade) {
        this.educateGrade = educateGrade;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
