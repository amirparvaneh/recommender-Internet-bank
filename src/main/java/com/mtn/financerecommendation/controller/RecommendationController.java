package com.mtn.financerecommendation.controller;


import com.mtn.financerecommendation.ApiVersion;
import com.mtn.financerecommendation.service.impl.RecommendServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = ApiVersion.VERSION_1 + "/recommendation")
public class RecommendationController {

    private final RecommendServiceImpl recommendService;

    public RecommendationController(RecommendServiceImpl recommendService){
        this.recommendService = recommendService;
    }
}
