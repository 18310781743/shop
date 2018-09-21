package com.zcc.shopweb.controller;

import com.zcc.entiy.StudentDO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @RequestMapping("add")
    public StudentDO add(){
        StudentDO studentDO = new StudentDO();
        studentDO.setId(1);
        studentDO.setName("zhuchengcai");
        studentDO.setAge(11);
        return studentDO;
    }

}
