package org.school.entity;

import java.util.Date;

/**
 * Created by Lee on 2017/8/1.
 */
public class Student {

    //学生编号
    private Long studentId;//` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '学生编号id',
    //学生姓名
    private String studentName;//` varchar(64) NOT NULL COMMENT '学生姓名',
    //学生性别
    private Integer studentsex;//` tinyint(4) NOT NULL DEFAULT '0' COMMENT '学生性别  0:男  1:女',
    //出生日期
    private Date studentBrithday;//` timestamp NOT NULL COMMENT '出生日期',
    //身份证号
    private Long studentCard;//` bigint(20) NOT NULL COMMENT '身份证号',
    //家庭住址
    private String studentHome;//` varchar(64) NOT NULL COMMENT '家庭住址',

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getStudentsex() {
        return studentsex;
    }

    public void setStudentsex(Integer studentsex) {
        this.studentsex = studentsex;
    }

    public Date getStudentBrithday() {
        return studentBrithday;
    }

    public void setStudentBrithday(Date studentBrithday) {
        this.studentBrithday = studentBrithday;
    }

    public Long getStudentCard() {
        return studentCard;
    }

    public void setStudentCard(long studentCard) {
        this.studentCard = studentCard;
    }

    public String getStudentHome() {
        return studentHome;
    }

    public void setStudentHome(String studentHome) {
        this.studentHome = studentHome;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentsex=" + studentsex +
                ", studentBrithday=" + studentBrithday +
                ", studentCard=" + studentCard +
                ", studentHome='" + studentHome + '\'' +
                '}';
    }
}
