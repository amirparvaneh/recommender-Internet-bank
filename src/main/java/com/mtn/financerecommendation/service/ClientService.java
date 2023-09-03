package com.mtn.financerecommendation.service;


import com.mtn.financerecommendation.dto.ClientAllResponseDto;
import com.mtn.financerecommendation.model.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService extends BaseService<Client>{

    Client getClientByAccount(Long accountId);
    List<ClientAllResponseDto> getAllClient();
}
