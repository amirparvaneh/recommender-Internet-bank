package com.mtn.financerecommendation.model.dto;

import com.mtn.financerecommendation.constants.ErrorMessage;
import com.mtn.financerecommendation.constants.BankingValue;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InterestRequestDto implements Serializable {

    @NotNull(message = ErrorMessage.Error_For_Interest_Name_Should_Fill)
    private String name;

    @NotNull(message = ErrorMessage.Error_For_Interest_Rate_Should_Fill)
    private Double interestRate;
    private Date createdAt;
    private Date updatedAt;
}
