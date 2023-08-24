package com.mtn.financerecommendation.service.impl;

import com.mtn.financerecommendation.exception.EntityNotFoundException;
import com.mtn.financerecommendation.model.Client;
import com.mtn.financerecommendation.repository.ClientRepo;
import com.mtn.financerecommendation.service.ClientService;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepo clientRepo;

    public ClientServiceImpl(ClientRepo clientRepo){
        this.clientRepo = clientRepo;
    }


    @Override
    public Client find(Long clientId) {
        try{

        }catch (EntityNotFoundException e){
            throw new EntityNotFoundException(e.getMessage());
        }
        Optional<Client> client = clientRepo.findById(clientId);
        return client.get();
    }


    @Override
    public void save(Client client) {

    }

    @Override
    public void delete(Client client) {

    }

}
