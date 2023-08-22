package com.mtn.financerecommendation.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

@Data
public class InterestDto implements Serializable {

    private String name;
    @NotNull(message = "should not be empty")
    @DecimalMin(value = "0.001")
    private Double interestRate;
}
