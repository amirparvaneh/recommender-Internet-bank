package com.mtn.financerecommendation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Account extends BaseEntity {

    private String name;
    private double balance;

    @ManyToOne
    @JoinColumn(name = "")
    private InterestCategory interestCategory;

    @OneToOne(mappedBy = "account")
    private Client client;
}
