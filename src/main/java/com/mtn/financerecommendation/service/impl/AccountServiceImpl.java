package com.mtn.financerecommendation.service.impl;


import com.mtn.financerecommendation.constants.ErrorMessage;
import com.mtn.financerecommendation.model.Client;
import com.mtn.financerecommendation.model.InterestCategory;
import com.mtn.financerecommendation.model.dto.AccountRequestDto;
import com.mtn.financerecommendation.exception.EntityNotFoundException;
import com.mtn.financerecommendation.model.Account;
import com.mtn.financerecommendation.repository.AccountRepo;
import com.mtn.financerecommendation.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepo accountRepo;
    private final ClientServiceImpl clientService;
    private final InterestServiceImpl interestService;

    @Override
    public Account addClientAccount(AccountRequestDto accountRequestDto) {
        Client client = clientService.find(accountRequestDto.getClientId());
        InterestCategory interestCategory = interestService.find(accountRequestDto.getInterestCategoryId());
        Account account = Account.builder()
                .client(client)
                .balance(accountRequestDto.getAmount())
                .interestCategory(interestCategory)
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
        find(account.getAccountId());
        accountRepo.delete(account);
    }

    @Override
    public Account find(Long accountId) {
        return accountRepo.findById(accountId).orElseThrow(() ->
                new EntityNotFoundException(ErrorMessage.Error_Not_Exist_ITEM + accountId));
    }
}
