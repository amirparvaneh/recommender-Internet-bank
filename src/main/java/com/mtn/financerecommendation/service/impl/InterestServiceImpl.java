package com.mtn.financerecommendation.service.impl;

import com.mtn.financerecommendation.repository.InterestRepo;
import com.mtn.financerecommendation.service.InterestService;
import org.springframework.stereotype.Service;


@Service
public class InterestServiceImpl implements InterestService {

    private final InterestRepo interestRepo;

    public InterestServiceImpl(InterestRepo interestRepo){
        this.interestRepo = interestRepo;
    }
}
