package com.mtn.financerecommendation.service.impl;

import com.mtn.financerecommendation.constants.ErrorMessage;
import com.mtn.financerecommendation.dto.ClientAllResponseDto;
import com.mtn.financerecommendation.exception.EntityNotFoundException;
import com.mtn.financerecommendation.model.Client;
import com.mtn.financerecommendation.repository.ClientRepo;
import com.mtn.financerecommendation.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepo clientRepo;
    private final ModelMapper mapper;

    @Override
    public Client getClientByAccount(Long accountId) {
        return null;
    }

    @Override
    public List<ClientAllResponseDto> getAllClient() {
        List<Client> clients = clientRepo.findAll();
        return clients.stream().map(client -> mapper.map(client,ClientAllResponseDto.class)).toList();
    }

    @Override
    public Client find(Long clientId) {
        return clientRepo.findById(clientId).orElseThrow(() ->
                new EntityNotFoundException(ErrorMessage.Error_Not_Exist_Client + clientId));
    }

    @Override
    public void save(Client client) {
        clientRepo.save(client);
    }

    @Override
    public void delete(Client client) {
        clientRepo.delete(client);
    }

}
