package com.atguigu.ssm.beans;
import java.sql.Date;

public class student {
    private int studentId;
    private String name;
    private String identifyNo;
    private String profess;
    private String classs;
    private Date enroTime;
    private String telNo;
    private int credit;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentifyNo() {
        return identifyNo;
    }

    public void setIdentifyNo(String identifyNo) {
        this.identifyNo = identifyNo;
    }

    public String getProfess() {
        return profess;
    }

    public void setProfess(String profess) {
        this.profess = profess;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    public Date getEnroTime() {
        return enroTime;
    }

    public void setEnroTime(Date enroTime) {
        this.enroTime = enroTime;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", identifyNo='" + identifyNo + '\'' +
                ", profess='" + profess + '\'' +
                ", classs='" + classs + '\'' +
                ", enroTime=" + enroTime +
                ", telNo='" + telNo + '\'' +
                ", credit=" + credit +
                '}';
    }
}
