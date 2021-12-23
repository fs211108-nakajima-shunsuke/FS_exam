package com.freestyle.exam.estimates.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    
    @RequestMapping("/")
    public String redirect(){
        return "redirect:estimates";
    }

    @RequestMapping("/estimates")
    public String get(){
        return "searchEstimate";
    } 
}
