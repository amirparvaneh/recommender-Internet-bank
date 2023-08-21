package com.mtn.financerecommendation.service.impl;

import com.mtn.financerecommendation.repository.RecommendRepo;
import com.mtn.financerecommendation.service.RecommendService;
import org.springframework.stereotype.Service;

@Service
public class RecommendServiceImpl implements RecommendService {

    private final RecommendRepo recommendRepo;

    public RecommendServiceImpl(RecommendRepo recommendRepo){
        this.recommendRepo = recommendRepo;
    }
}
