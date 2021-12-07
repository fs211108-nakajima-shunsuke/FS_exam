package com.freestyle.exam.estimates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class DbController {
    @Autowired
    private mst_productsRepository productRepository;

    @GetMapping
    public String index(Model model){
        List<mst_products> list = productRepository.getAll();
        model.addAttribute("productsList", list);
        return "/index";
    }
}