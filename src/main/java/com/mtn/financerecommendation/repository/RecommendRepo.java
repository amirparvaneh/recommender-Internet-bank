package com.mtn.financerecommendation.repository;

import com.mtn.financerecommendation.model.Recommendation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecommendRepo extends JpaRepository<Recommendation,Long> {
}
