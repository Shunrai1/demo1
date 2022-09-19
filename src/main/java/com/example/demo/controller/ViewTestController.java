package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author Lin
 * @Date 2022/9/18 20:30
 * @Version 1.0
 */
@Controller
public class ViewTestController {
    @GetMapping("/thymeleaf")
    public String thymeleaf(Model model){
        model.addAttribute("msg","你好，尚硅谷");
        model.addAttribute("link","https://www.baidu.com");
        return "success";
    }
}
