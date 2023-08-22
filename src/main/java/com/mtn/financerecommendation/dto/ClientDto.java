package com.mtn.financerecommendation.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ClientDto implements Serializable {

    private String name;
    private Double amount;
    private Double interestRate;
}
