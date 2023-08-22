package com.mtn.financerecommendation.service;


import com.mtn.financerecommendation.dto.AccountDto;
import com.mtn.financerecommendation.model.Account;

public interface AccountService extends BaseService<Account>{

    Account addClientAccount(AccountDto accountDto);
}
