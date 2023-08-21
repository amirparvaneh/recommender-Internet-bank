package com.mtn.financerecommendation.controller;


import com.mtn.financerecommendation.ApiVersion;
import com.mtn.financerecommendation.service.impl.InterestServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = ApiVersion.VERSION_1 + "/interest")
public class InterestCategoryController {

    private final InterestServiceImpl interestService;

    public InterestCategoryController(InterestServiceImpl interestService) {
        this.interestService = interestService;
    }
}
