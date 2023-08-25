package com.mtn.financerecommendation.controller;


import com.mtn.financerecommendation.ApiVersion;
import com.mtn.financerecommendation.dto.ClientRequestDto;
import com.mtn.financerecommendation.model.Client;
import com.mtn.financerecommendation.service.impl.ClientServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = ApiVersion.VERSION_1 + "/client")
public class ClientController {

    private final ClientServiceImpl clientService;
    private final ModelMapper mapper;


    public ClientController(ClientServiceImpl clientService, ModelMapper mapper) {
        this.clientService = clientService;
        this.mapper = mapper;
    }


    @PostMapping
    public ResponseEntity<String> createClient(@RequestBody ClientRequestDto clientRequestDto) {
        //Client client = ClientMapper.INSTANCE.clientReqDtoToClient(clientRequestDto);
        Client client = mapper.map(clientRequestDto, Client.class);
        clientService.save(client);
        return ResponseEntity.status(HttpStatus.CREATED).body("client created");
    }

    @GetMapping(value = "/all")
    public ResponseEntity<List<Client>> getAllClient() {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(clientService.getAllClient());
    }

}
