package com.mtn.financerecommendation.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.io.Serializable;
import java.util.Date;

import static jakarta.persistence.TemporalType.TIMESTAMP;

@MappedSuperclass
@Data
public abstract class BaseEntity implements Serializable {


    @Temporal(TIMESTAMP)
    @Column(name = "created_at",nullable = false,updatable = false)
    @CreatedDate
    private Date createAt;

    @Temporal(TIMESTAMP)
    @Column(name = "update_at",nullable = false)
    private Date updateAt;

    @Version
    @Column
    private Integer version;

}
