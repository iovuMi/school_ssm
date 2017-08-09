package org.school.controller;

import org.school.entity.Student;
import org.school.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Lee on 2017/8/5.
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String queryStudent(Model model){
        List<Student> students = studentService.queryStudent();
        model.addAttribute("students",students);
        return "Student";
    }
}
