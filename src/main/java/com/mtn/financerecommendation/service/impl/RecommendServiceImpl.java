package com.mtn.financerecommendation.service.impl;

import com.mtn.financerecommendation.model.Recommendation;
import com.mtn.financerecommendation.repository.RecommendRepo;
import com.mtn.financerecommendation.service.RecommendService;
import org.springframework.stereotype.Service;

@Service
public class RecommendServiceImpl implements RecommendService {

    private final RecommendRepo recommendRepo;
    private final CalculationService calculationService;

    public RecommendServiceImpl(RecommendRepo recommendRepo,CalculationService calculationService) {
        this.recommendRepo = recommendRepo;
        this.calculationService = calculationService;
    }

    @Override
    public Double currentAccountIncome(Long accountId) {
        return calculationService.accountIncomePerUser(accountId);
    }

    @Override
    public void save(Recommendation recommendation) {

    }

    @Override
    public void delete(Recommendation recommendation) {

    }

    @Override
    public Recommendation find(Long id) {
        return null;
    }


}
