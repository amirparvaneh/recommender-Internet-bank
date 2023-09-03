package com.mtn.financerecommendation.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponseEntity<T> implements Serializable {
    private String message;
    private T result;
}
