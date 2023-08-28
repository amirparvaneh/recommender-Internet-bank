package com.mtn.financerecommendation.controller;


import com.mtn.financerecommendation.ApiVersion;
import com.mtn.financerecommendation.dto.RecommendationRequestDto;
import com.mtn.financerecommendation.dto.RecommendationResponseDto;
import com.mtn.financerecommendation.model.Account;
import com.mtn.financerecommendation.model.Client;
import com.mtn.financerecommendation.service.impl.AccountServiceImpl;
import com.mtn.financerecommendation.service.impl.ClientServiceImpl;
import com.mtn.financerecommendation.service.impl.RecommendServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping(value = ApiVersion.VERSION_1 + "/recommendation")
public class RecommendationController {

    private final RecommendServiceImpl recommendService;
    private final ClientServiceImpl clientService;
    private final ModelMapper modelMapper;
    private final AccountServiceImpl accountService;

    public RecommendationController(RecommendServiceImpl recommendService, ClientServiceImpl clientService,
                                    ModelMapper modelMapper,AccountServiceImpl accountService) {
        this.recommendService = recommendService;
        this.clientService = clientService;
        this.modelMapper = modelMapper;
        this.accountService = accountService;
    }


    @GetMapping(value = "/accountIncome")
    public ResponseEntity<RecommendationResponseDto> getCurrentAccountIncome(@RequestBody RecommendationRequestDto recommendationRequestDto) {
        Double income = null;
        Client client = clientService.find(recommendationRequestDto.getClientId());
        Account account = accountService.find(recommendationRequestDto.getAccountId());
        if (Objects.nonNull(client)) {
            income = recommendService.currentAccountIncome(recommendationRequestDto.getAccountId());
        } else ResponseEntity.status(HttpStatus.BAD_REQUEST);
        RecommendationResponseDto recommendationResponseDto = RecommendationResponseDto.builder()
                .accountName(account.getName())
                .income(income)
                .userName(client.getUsername())
                .build();
        return ResponseEntity.ok(recommendationResponseDto);
    }
}
