package com.freestyle.exam.estimates;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class ProductController {
    
    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping(value="/estimates/mst_products", method=RequestMethod.GET)
    public String productsAll() {
        return jdbcTemplate.queryForList("SELECT * FROM mst_products").toString();
    }
    
}
