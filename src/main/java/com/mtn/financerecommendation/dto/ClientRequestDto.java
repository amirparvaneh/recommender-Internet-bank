package com.mtn.financerecommendation.dto;

import com.mtn.financerecommendation.constants.ErrorMessage;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.awt.*;
import java.io.Serializable;
import java.util.Date;

@Data
public class ClientRequestDto implements Serializable {

    @NotNull(message = ErrorMessage.Error_for_create_client)
    private String name;
    @NotNull(message = ErrorMessage.Error_for_create_client)
    private Double amount;
    @NotNull(message = ErrorMessage.Error_for_create_client)
    private Double interestRate;
    private Date createAt;
    private Date updatedAt;
}
