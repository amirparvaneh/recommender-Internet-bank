package com.mtn.financerecommendation.dto.mapper;

import com.mtn.financerecommendation.dto.ClientRequestDto;
import com.mtn.financerecommendation.model.Client;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClientMapper {
    ClientMapper INSTANCE = Mappers.getMapper(ClientMapper.class);

    Client clientReqDtoToClient(ClientRequestDto clientRequestDto);
}
