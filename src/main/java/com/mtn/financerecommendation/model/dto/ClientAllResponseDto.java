package com.mtn.financerecommendation.model.dto;

import com.mtn.financerecommendation.model.Account;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClientAllResponseDto implements Serializable {
    private Long clientId;
    private String userName;
    private Account account;
}
