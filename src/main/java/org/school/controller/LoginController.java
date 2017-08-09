package org.school.controller;

import org.school.entity.Login;
import org.school.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Lee on 2017/8/8.
 */
@Controller
public class LoginController{

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(Login login){
        int i = loginService.queryLogin(login);
        if (i==1){
            return "redirect:/student/list";
        }else{
            return "redirect:/index.jsp";
        }
    }
}
