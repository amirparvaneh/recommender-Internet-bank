package com.mtn.financerecommendation.service.impl;

import com.mtn.financerecommendation.model.InterestCategory;
import com.mtn.financerecommendation.repository.InterestRepo;
import com.mtn.financerecommendation.service.InterestService;
import org.springframework.stereotype.Service;


@Service
public class InterestServiceImpl implements InterestService {

    private final InterestRepo interestRepo;

    public InterestServiceImpl(InterestRepo interestRepo){
        this.interestRepo = interestRepo;
    }

    @Override
    public void save(InterestCategory interestCategory) {

    }

    @Override
    public void delete(InterestCategory interestCategory) {

    }

    @Override
    public InterestCategory find(Long id) {
        return null;
    }
}
