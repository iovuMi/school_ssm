package org.school.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.school.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Lee on 2017/8/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class StudentDaoTest {

    @Resource
    private StudentDao studentDao;
    @Test
    public void queryStudent() throws Exception {
        List<Student> students=studentDao.queryStudent();
        System.out.println(1);
        for (Student student:students){
            System.out.println(student);
        }
    }

}