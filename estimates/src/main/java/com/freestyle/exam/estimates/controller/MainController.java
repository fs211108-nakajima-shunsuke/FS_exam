package com.freestyle.exam.estimates.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    
    @RequestMapping("/estimates")
    public String get(){
        return "estimate";
    }
}
