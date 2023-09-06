package com.mtn.financerecommendation.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecommendationRequestDto implements Serializable {
    private Long clientId;
    private Long accountId;
}
