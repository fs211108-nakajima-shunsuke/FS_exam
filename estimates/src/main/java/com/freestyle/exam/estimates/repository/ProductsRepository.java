package com.freestyle.exam.estimates.repository;

import com.freestyle.exam.estimates.entity.Products;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Integer>{
    
}
