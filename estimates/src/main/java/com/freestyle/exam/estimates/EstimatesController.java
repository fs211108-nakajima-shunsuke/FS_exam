package com.freestyle.exam.estimates;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EstimatesController {
    
    @RequestMapping("/estimates")
    public String get(){
        return "estimate";
    }
}
