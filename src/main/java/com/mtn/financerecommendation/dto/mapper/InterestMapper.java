package com.mtn.financerecommendation.dto.mapper;

import com.mtn.financerecommendation.dto.InterestRequestDto;
import com.mtn.financerecommendation.model.InterestCategory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface InterestMapper {
    InterestMapper INSTANCE = Mappers.getMapper(InterestMapper.class);
    InterestCategory interestReqDtoToInterest(InterestRequestDto interestRequestDto);
}
