package com.mtn.financerecommendation.controller;

import com.mtn.financerecommendation.ApiVersion;
import com.mtn.financerecommendation.service.impl.AccountServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = ApiVersion.VERSION_1 + "/account")
public class AccountController {

    private final AccountServiceImpl accountService;

    public AccountController(AccountServiceImpl accountService){
        this.accountService = accountService;
    }
}
