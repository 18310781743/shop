package com.zcc.service.impl;

import com.zcc.StudentDao;
import com.zcc.entiy.StudentDO;
import com.zcc.service.StudentService;

import javax.annotation.Resource;

public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;
    @Override
    public int add(StudentDO studentDO) {
        return studentDao.add(studentDO);
    }
}
