package org.school.service.Impl;

import org.school.dao.LoginDao;
import org.school.entity.Login;
import org.school.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Lee on 2017/8/8.
 */
@Service
public class LoginServiceImpl implements LoginService {


    @Autowired
    private LoginDao loginDao;
    @Override
    public int queryLogin(Login login) {
        return loginDao.queryLogin(login);
    }
}
