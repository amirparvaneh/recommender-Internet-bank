package com.mtn.financerecommendation.controller;


import com.mtn.financerecommendation.ApiVersion;
import com.mtn.financerecommendation.dto.ClientRequestDto;
import com.mtn.financerecommendation.model.Client;
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
    public ResponseEntity<String> createClient(@RequestBody ClientRequestDto clientRequestDto) {
        Client client = modelMapper.map(clientRequestDto, Client.class);
        clientService.save(client);
        return ResponseEntity.ok("the client saved");
    }
}
