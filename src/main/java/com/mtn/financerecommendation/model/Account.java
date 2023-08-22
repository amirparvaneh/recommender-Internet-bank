package com.mtn.financerecommendation.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
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
    @NotNull
    private double balance;

    @OneToOne
    @JoinColumn(name = "interest-category-id")
    @NotNull
    private InterestCategory interestCategory;

    @NotNull
    @OneToOne(mappedBy = "account")
    private Client client;
}
