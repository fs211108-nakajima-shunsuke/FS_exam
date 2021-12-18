package com.freestyle.exam.estimates.controller;

import java.util.List;

import com.freestyle.exam.estimates.entity.Products;
import com.freestyle.exam.estimates.repository.ProductsRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ProductsController {
    private final ProductsRepository productsRepository;

    public ProductsController(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @GetMapping("/api/v1/products")
    public ModelAndView showProductsList(ModelAndView mv){
        mv.setViewName("productsList");
        List <Products> productList = productsRepository.findAll();
        mv.addObject("productsList", productList);
        return mv;
    }
}
