package com.mtn.financerecommendation.model;

import com.mtn.financerecommendation.constants.BankingValue;
import com.mtn.financerecommendation.constants.ErrorMessage;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "interest_rate")
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class InterestCategory extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "interest_id")
    private Long interestId;
    private String name;
    @DecimalMin(value = BankingValue.rate_risk)
    @Positive(message = ErrorMessage.Positive_Value)
    private double interestRate;
}
