package com.mtn.financerecommendation.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "interest_rate")
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class InterestCategory extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "interest_id")
    private Long interestId;
    private String name;
    private double interestRate;
}
