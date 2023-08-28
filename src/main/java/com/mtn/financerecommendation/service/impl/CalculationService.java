package com.mtn.financerecommendation.service.impl;

import com.mtn.financerecommendation.model.Account;
import org.springframework.stereotype.Service;

@Service
public class CalculationService {

    private final AccountServiceImpl accountService;

    public CalculationService(AccountServiceImpl accountService){
        this.accountService = accountService;
    }

    public Double accountIncomePerUser(Long accountId){
        Account account = accountService.find(accountId);
        return account.getBalance() * account.getInterestCategory().getInterestRate();
    }
}
