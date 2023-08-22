package com.mtn.financerecommendation.service.impl;


import com.mtn.financerecommendation.dto.AccountDto;
import com.mtn.financerecommendation.model.Account;
import com.mtn.financerecommendation.model.Client;
import com.mtn.financerecommendation.repository.AccountRepo;
import com.mtn.financerecommendation.service.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.Optional;


@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepo accountRepo;
    private final ClientServiceImpl clientService;

    public AccountServiceImpl(AccountRepo accountRepo, ClientServiceImpl clientService){
        this.accountRepo = accountRepo;
        this.clientService = clientService;
    }

    @Override
    public Account addClientAccount(AccountDto accountDto) {
        Client client = clientService.find(accountDto.getClientId());
        Account account = Account.builder()
                .client(client)
                .balance(accountDto.getAmount())
                .build();
        accountRepo.save(account);
        return account;
    }

    @Override
    public void save(Account account) {
        accountRepo.save(account);
    }

    @Override
    public void delete(Account account) {
        accountRepo.delete(account);
    }

    @Override
    public Account find(Long id) {
        try{
            Optional<Account> account = accountRepo.findById(id);
            return account.get();
        }catch (NotFoundException e){
            throw new NotFoundException(e.getMessage());
        }
    }
}
