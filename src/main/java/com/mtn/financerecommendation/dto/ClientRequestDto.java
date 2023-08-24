package com.mtn.financerecommendation.dto;

import com.mtn.financerecommendation.constants.ErrorMessage;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

@Data
public class ClientRequestDto implements Serializable {

    @NotNull(message = ErrorMessage.Error_for_create_client)
    private String name;
    @NotNull(message = ErrorMessage.Error_for_create_client)
    private Double amount;
    @NotNull(message = ErrorMessage.Error_for_create_client)
    private Double interestRate;
}
