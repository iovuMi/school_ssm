package org.school.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.school.entity.Login;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.SortedMap;

import static org.junit.Assert.*;

/**
 * Created by Lee on 2017/8/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class LoginDaoTest {
    @Resource
    private LoginDao loginDao;
    @Test
    public void queryLogin() throws Exception {
        Login login=new Login();
        login.setPassWord("123");
        login.setUserName("ls");
        int i=loginDao.queryLogin(login);
        System.out.println(i);
    }

}