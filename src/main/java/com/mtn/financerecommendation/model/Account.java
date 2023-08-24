package com.mtn.financerecommendation.model;

import jakarta.persistence.*;
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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private Long accountId;
    private String name;
    private double balance;

    @OneToOne
    @JoinColumn(name = "interest_id")
    @NotNull
    private InterestCategory interestCategory;

    @NotNull
    @OneToOne(mappedBy = "account")
    private Client client;
}
