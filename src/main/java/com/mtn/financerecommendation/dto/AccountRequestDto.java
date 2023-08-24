package com.mtn.financerecommendation.dto;

import com.mtn.financerecommendation.constants.BankingValue;
import com.mtn.financerecommendation.constants.ErrorMessage;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

@Data
public class AccountRequestDto implements Serializable {

    @NotNull(message = ErrorMessage.Error_for_client_id_to_assign_account)
    private Long clientId;
    @DecimalMin(value = BankingValue.account_value,message = ErrorMessage.Error_For_Minimum_Balance_Account)
    private Double amount;
}
