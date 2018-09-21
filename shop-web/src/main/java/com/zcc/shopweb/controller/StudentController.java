package com.zcc.shopweb.controller;

import com.zcc.entiy.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @RequestMapping("add")
    public Student add(){
        Student student = new Student();
        student.setId(1);
        student.setName("zhuchengcai");
        student.setAge(11);
        return student;
    }

}
