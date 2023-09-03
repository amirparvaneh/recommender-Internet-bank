package com.mtn.financerecommendation.controller;

import com.mtn.financerecommendation.ApiVersion;
import com.mtn.financerecommendation.constants.Messages;
import com.mtn.financerecommendation.dto.AccountRequestDto;
import com.mtn.financerecommendation.dto.BaseResponseEntity;
import com.mtn.financerecommendation.model.Account;
import com.mtn.financerecommendation.service.impl.AccountServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = ApiVersion.VERSION_1 + "/accounts")
@RequiredArgsConstructor
public class AccountController {

    private final AccountServiceImpl accountService;

    @PostMapping(value = "/assign-account")
    public ResponseEntity<BaseResponseEntity<Object>> assignClientAccount(@RequestBody AccountRequestDto accountRequestDto) {

        Account account = accountService.addClientAccount(accountRequestDto);
        return ResponseEntity.ok().body(BaseResponseEntity.builder()
                .message(Messages.ACCOUNT_ASSIGNMENT_COMPLETED + accountRequestDto.getClientId())
                .result(account)
                .build());
    }
}
