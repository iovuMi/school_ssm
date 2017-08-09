/*创建数据库*/
CREATE DATABASE `school_ssm`CHARACTER SET utf8;

/*使用数据库school_ssm*/
use 'school_ssm';

/*创建student表*/
CREATE TABLE `student`(
    `student_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '学生编号id',
    `student_name` varchar(64) NOT NULL COMMENT '学生姓名',
    `student_sex` tinyint(4) NOT NULL DEFAULT '0' COMMENT '学生性别  0:男  1:女',
    `student_brithday` timestamp NOT NULL COMMENT '出生日期',
    `student_card` bigint(20) NOT NULL COMMENT '身份证号',
    `student_home` varchar(64) NOT NULL COMMENT '家庭住址',
  PRIMARY KEY (`student_id`)
)ENGINE=InnoDB AUTO_INCREMENT=20130910001 DEFAULT CHARSET=utf8 COMMENT '学生信息表';