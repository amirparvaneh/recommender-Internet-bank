package com.mtn.financerecommendation.model;

import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Account extends BaseEntity {
    private String name;
    private double balance;

    @ManyToOne
    private InterestCategory interestCategory;
}
