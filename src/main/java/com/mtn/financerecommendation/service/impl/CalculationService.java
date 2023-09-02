package com.mtn.financerecommendation.service.impl;

import com.mtn.financerecommendation.model.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CalculationService {

    private final AccountServiceImpl accountService;

    public Double accountIncomePerUser(Long accountId){
        Account account = accountService.find(accountId);
        return account.getBalance() * account.getInterestCategory().getInterestRate();
    }
}
