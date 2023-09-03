package com.mtn.financerecommendation.controller;


import com.mtn.financerecommendation.ApiVersion;
import com.mtn.financerecommendation.constants.Messages;
import com.mtn.financerecommendation.dto.BaseResponseEntity;
import com.mtn.financerecommendation.dto.ClientAllResponseDto;
import com.mtn.financerecommendation.dto.ClientRequestDto;
import com.mtn.financerecommendation.model.Client;
import com.mtn.financerecommendation.service.impl.ClientServiceImpl;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = ApiVersion.VERSION_1 + "/clients")
@RequiredArgsConstructor
public class ClientController {

    private final ClientServiceImpl clientService;
    private final ModelMapper mapper;


    @PostMapping
    public ResponseEntity<BaseResponseEntity<Object>> addNewClient(@RequestBody ClientRequestDto clientRequestDto) {
        Client client = mapper.map(clientRequestDto, Client.class);
        clientService.save(client);
        return ResponseEntity.ok().body(BaseResponseEntity.builder()
                        .message(Messages.ITEM_SAVED_SUCCESSFUL)
                .build());
    }

    @GetMapping
    public ResponseEntity<List<ClientAllResponseDto>> getAllClient() {
        return ResponseEntity.ok().body(clientService.getAllClient());
    }

    @GetMapping(value = "/{clientId}")
    public ResponseEntity<BaseResponseEntity<Object>> getClientById(@PathVariable Long clientId){
        return ResponseEntity.ok().body(BaseResponseEntity.builder()
                        .result(clientService.find(clientId))
                .build());
    }

    @DeleteMapping(value = "/{clientId}")
    public ResponseEntity<BaseResponseEntity<Object>> deleteClientById(@PathVariable Long clientId) {
        clientService.delete(clientService.find(clientId));
        return ResponseEntity.ok().body(BaseResponseEntity.builder()
                .message(Messages.ITEM_DELETED_COMPLETE)
                .build());
    }

}
