package com.mtn.financerecommendation.repository;

import com.mtn.financerecommendation.model.InterestCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InterestRepo extends JpaRepository<InterestCategory,Long> {
}
