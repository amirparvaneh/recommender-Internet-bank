package com.mtn.financerecommendation.service;

import com.mtn.financerecommendation.model.Recommendation;

public interface RecommendService extends BaseService<Recommendation> {
    Double currentAccountIncome(Long accountId);
}
