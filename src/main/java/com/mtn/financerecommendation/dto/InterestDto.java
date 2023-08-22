package com.mtn.financerecommendation.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class InterestDto implements Serializable {

    private String name;
    private Double interestRate;
}
