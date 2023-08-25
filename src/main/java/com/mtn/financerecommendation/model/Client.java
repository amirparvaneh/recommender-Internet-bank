package com.mtn.financerecommendation.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "client")
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Client extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "client_id")
    private Long clientId;
    @Column(name = "user_name")
    private String username;

    @OneToOne
    @JoinColumn(name = "account_id")
    private Account account;
}
