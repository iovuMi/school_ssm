package org.school.dao;

import org.school.entity.Student;

import java.util.List;

/**
 * Created by Lee on 2017/8/1.
 */
public interface StudentDao {

    List<Student> queryStudent();
}
