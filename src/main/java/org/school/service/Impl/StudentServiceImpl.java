package org.school.service.Impl;

import org.school.dao.StudentDao;
import org.school.entity.Student;
import org.school.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Lee on 2017/8/5.
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;
    @Override
    public List<Student> queryStudent() {
        return studentDao.queryStudent();
    }
}
