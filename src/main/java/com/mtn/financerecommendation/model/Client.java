package com.mtn.financerecommendation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
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
public class Client extends BaseEntity {

    @NotNull(message = "client should have name")
    private String username;

    @OneToOne
    @JoinColumn(name = "account_id")
    private Account account;
}
