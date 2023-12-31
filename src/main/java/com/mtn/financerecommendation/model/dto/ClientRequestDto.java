package com.mtn.financerecommendation.model.dto;

import com.mtn.financerecommendation.constants.ErrorMessage;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientRequestDto implements Serializable {

    @NotNull(message = ErrorMessage.Error_for_create_client)
    private String username;
    private Date createdAt;
    private Date updatedAt;
}
