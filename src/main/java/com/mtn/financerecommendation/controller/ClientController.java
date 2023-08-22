package com.mtn.financerecommendation.controller;


import com.mtn.financerecommendation.ApiVersion;
import com.mtn.financerecommendation.dto.ClientDto;
import com.mtn.financerecommendation.model.Client;
import com.mtn.financerecommendation.service.impl.ClientServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = ApiVersion.VERSION_1 + "/user")
public class ClientController {

    private final ClientServiceImpl clientService;
    private final ModelMapper modelMapper;

    public ClientController(ClientServiceImpl clientService,ModelMapper modelMapper){
        this.clientService = clientService;
        this.modelMapper = modelMapper;
    }


    @PostMapping
    public ResponseEntity<String> createClient(@RequestBody ClientDto clientDto){
        Client client = modelMapper.map(clientDto, Client.class);
        clientService.save(client);
        return ResponseEntity.ok("the client saved");
    }
}
