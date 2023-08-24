package com.mtn.financerecommendation.dto;

import com.mtn.financerecommendation.constants.ErrorMessage;
import com.mtn.financerecommendation.constants.BankingValue;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

@Data
public class InterestRequestDto implements Serializable {

    @NotNull(message = ErrorMessage.Error_For_Interest_Name_Should_Fill)
    private String name;

    @NotNull(message = ErrorMessage.Error_For_Interest_Rate_Should_Fill)
    @DecimalMin(value = BankingValue.rate_risk)
    private Double interestRate;
}
