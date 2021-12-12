package com.freestyle.exam.estimates.controller;

import java.util.List;

import com.freestyle.exam.estimates.entity.Products;
import com.freestyle.exam.estimates.repository.ProductsRepository;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class ProductsController {
    private final ProductsRepository productsRepository;

    public ProductsController(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
        System.out.println("コンストラクタ");   //ここは表示される
    }

    @GetMapping("/products")
    public ModelAndView showProductsList(ModelAndView mv){
        System.out.println("productsに入りました"); //ここは表示されない

        mv.setViewName("productsList");
        List <Products> producList = productsRepository.findAll();
        mv.addObject("productsList", producList);
        return mv;
    }
}
