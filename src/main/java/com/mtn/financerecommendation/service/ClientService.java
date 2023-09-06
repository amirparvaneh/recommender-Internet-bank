package com.mtn.financerecommendation.service;


import com.mtn.financerecommendation.model.dto.ClientAllResponseDto;
import com.mtn.financerecommendation.model.Client;

import java.util.List;

public interface ClientService extends BaseService<Client>{

    Client getClientByAccount(Long accountId);
    List<ClientAllResponseDto> getAllClient();
}
