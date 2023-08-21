package com.mtn.financerecommendation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InterestRepo extends JpaRepository<InterestRepo,Long> {
}
