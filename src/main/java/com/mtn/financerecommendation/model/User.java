package com.mtn.financerecommendation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user-bank")
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class User extends BaseEntity {
    private String username;
}
