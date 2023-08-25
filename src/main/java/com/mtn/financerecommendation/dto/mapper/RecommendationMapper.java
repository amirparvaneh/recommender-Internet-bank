package com.mtn.financerecommendation.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RecommendationMapper {
    RecommendationMapper INSTANCE = Mappers.getMapper(RecommendationMapper.class);


}
