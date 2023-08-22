package com.mtn.financerecommendation.service.impl;

import com.mtn.financerecommendation.model.Client;
import com.mtn.financerecommendation.repository.ClientRepo;
import com.mtn.financerecommendation.service.ClientService;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepo clientRepo;

    public ClientServiceImpl(ClientRepo clientRepo){
        this.clientRepo = clientRepo;
    }


    @Override
    public void save(Client client) {

    }

    @Override
    public void delete(Client client) {

    }

    @Override
    public Client find(Long id) {
        return null;
    }
}
