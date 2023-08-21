package com.mtn.financerecommendation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Recommendation extends BaseEntity {

    @ManyToOne
    private User user;

    @ManyToOne
    private Account currentAccount;

    @ManyToOne
    private Account recommendedAccount;

    private double recommendedInterest;
}
