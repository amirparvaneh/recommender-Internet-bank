package com.mtn.financerecommendation.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RecommendationResponseDto implements Serializable {
    private String accountName;
    private String userName;
    private Double income;
}
