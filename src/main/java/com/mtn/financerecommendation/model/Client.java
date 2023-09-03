package com.mtn.financerecommendation.model;

import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private Long clientId;
    @Column
    private String username;
    @OneToOne
    @JoinColumn(name = "account_id")
    private Account account;
}
