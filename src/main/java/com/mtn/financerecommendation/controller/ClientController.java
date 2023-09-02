package com.mtn.financerecommendation.controller;


import com.mtn.financerecommendation.ApiVersion;
import com.mtn.financerecommendation.dto.ClientRequestDto;
import com.mtn.financerecommendation.model.Client;
import com.mtn.financerecommendation.service.impl.ClientServiceImpl;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = ApiVersion.VERSION_1 + "/clients")
@RequiredArgsConstructor
public class ClientController {

    private final ClientServiceImpl clientService;
    private final ModelMapper modelMapper;



    @PostMapping
    public ResponseEntity<String> createClient(@RequestBody ClientRequestDto clientRequestDto) {
        Client client = modelMapper.map(clientRequestDto, Client.class);
        clientService.save(client);
        return ResponseEntity.status(HttpStatus.CREATED).body("client created");
    }

    @GetMapping
    public ResponseEntity<List<Client>> getAllClient() {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(clientService.getAllClient());
    }

}
