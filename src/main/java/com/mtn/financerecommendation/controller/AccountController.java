package com.mtn.financerecommendation.controller;

import com.mtn.financerecommendation.ApiVersion;
import com.mtn.financerecommendation.dto.AccountRequestDto;
import com.mtn.financerecommendation.model.Account;
import com.mtn.financerecommendation.service.impl.AccountServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = ApiVersion.VERSION_1 + "/account")
public class AccountController {

    private final AccountServiceImpl accountService;

    public AccountController(AccountServiceImpl accountService){
        this.accountService = accountService;
    }

    @PostMapping(value = "/assignClient")
    public ResponseEntity<?> createClientAccount(@RequestBody @Validated AccountRequestDto accountRequestDto, BindingResult bindingResult){
        Account account = accountService.addClientAccount(accountRequestDto);
        if(bindingResult.hasErrors()){
            return ResponseEntity.badRequest().body(bindingResult.getAllErrors());
        }
        return ResponseEntity.ok(account);
    }
}
