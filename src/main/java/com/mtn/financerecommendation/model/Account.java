package com.mtn.financerecommendation.model;

import jakarta.persistence.*;
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
    @Column
    private String name;
    @Column
    private double balance;
    @OneToOne
    @JoinColumn(name = "interest_id")
    private InterestCategory interestCategory;
    @OneToOne(mappedBy = "account")
    private Client client;
}
