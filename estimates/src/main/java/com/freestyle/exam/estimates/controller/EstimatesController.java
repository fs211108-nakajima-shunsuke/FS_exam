package com.freestyle.exam.estimates.controller;

import java.util.List;

import com.freestyle.exam.estimates.entity.Estimates;
import com.freestyle.exam.estimates.repository.EstimatesRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class EstimatesController {
    private final EstimatesRepository estimatesRepository;

    public EstimatesController(EstimatesRepository estimatesRepository) {
        this.estimatesRepository = estimatesRepository;
    }

    @GetMapping("api/v1/estimates")
    public String showEstimates() {
        List<Estimates> estimatesList = estimatesRepository.findAll();
        System.out.println(estimatesList.get(1).getName());

        return "test";
    }
}
