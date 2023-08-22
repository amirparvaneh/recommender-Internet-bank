package com.mtn.financerecommendation.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.aspectj.weaver.ast.Not;

import java.io.Serializable;

@Data
public class ClientDto implements Serializable {

    @NotNull
    private String name;
    @NotNull
    private Double amount;
    @NotNull
    private Double interestRate;
}
