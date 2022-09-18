package com.example.demo.controller;

import com.example.demo.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Lin
 * @Date 2022/9/18 14:30
 * @Version 1.0
 */
@RestController
public class HelloController {
    @Autowired
    Person person;

    @RequestMapping("hello")
    public Person getPerson(){
        return person;
    }


}
