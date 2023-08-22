package com.mtn.financerecommendation.service;

public interface BaseService<T>{
    void save(T t);
    void delete(T t);
    T find(Long id);
}
