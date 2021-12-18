package com.freestyle.exam.estimates.repository;

import com.freestyle.exam.estimates.entity.Estimates;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstimatesRepository extends JpaRepository<Estimates, Integer>{
    
}
