package com.mtn.financerecommendation.dto;

import com.mtn.financerecommendation.constants.ErrorMessage;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientRequestDto implements Serializable {

    @NotNull(message = ErrorMessage.Error_for_create_client)
    private String username;
    @NotNull(message = ErrorMessage.Error_for_create_client)
    private Double amount;
    @NotNull(message = ErrorMessage.Error_for_create_client)
    private Double interestRate;
    private Date createdAt;
    private Date updatedAt;
}
