package com.mtn.financerecommendation.service;


import com.mtn.financerecommendation.dto.AccountRequestDto;
import com.mtn.financerecommendation.model.Account;

public interface AccountService extends BaseService<Account>{

    Account addClientAccount(AccountRequestDto accountRequestDto);
}
