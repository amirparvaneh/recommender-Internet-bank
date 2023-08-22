package com.mtn.financerecommendation.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

@Data
public class AccountDto implements Serializable {

    @NotNull(message = "this field is mandatory!")
    private Long clientId;
    @DecimalMin(value = "1000",message = "the minimum amount is 1000")
    private Double amount;
}
