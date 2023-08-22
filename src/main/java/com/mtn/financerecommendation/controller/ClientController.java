package com.mtn.financerecommendation.controller;


import com.mtn.financerecommendation.ApiVersion;
import com.mtn.financerecommendation.dto.AccountDto;
import com.mtn.financerecommendation.dto.ClientDto;
import com.mtn.financerecommendation.model.Account;
import com.mtn.financerecommendation.model.Client;
import com.mtn.financerecommendation.service.impl.AccountServiceImpl;
import com.mtn.financerecommendation.service.impl.ClientServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = ApiVersion.VERSION_1 + "/client")
public class ClientController {

    private final ClientServiceImpl clientService;
    private final ModelMapper modelMapper;

    public ClientController(ClientServiceImpl clientService, ModelMapper modelMapper) {
        this.clientService = clientService;
        this.modelMapper = modelMapper;
    }


    @PostMapping
    public ResponseEntity<String> createClient(@RequestBody ClientDto clientDto) {
        Client client = modelMapper.map(clientDto, Client.class);
        clientService.save(client);
        return ResponseEntity.ok("the client saved");
    }
}
