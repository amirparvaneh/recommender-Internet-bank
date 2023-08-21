package com.mtn.financerecommendation.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class InterestCategory extends BaseEntity {
    private String name;
    private double interestRate;
}
