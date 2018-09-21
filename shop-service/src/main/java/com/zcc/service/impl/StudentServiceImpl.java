package com.zcc.service.impl;

import com.zcc.StudentDao;
import com.zcc.entiy.Student;
import com.zcc.service.StudentService;

import javax.annotation.Resource;

public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;
    @Override
    public int add(Student student) {
        return studentDao.add(student);
    }
}
