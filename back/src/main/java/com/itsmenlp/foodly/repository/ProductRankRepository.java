package com.itsmenlp.foodly.repository;

import com.itsmenlp.foodly.entity.ProductRank;
import com.itsmenlp.foodly.entity.ProductRankId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRankRepository extends JpaRepository<ProductRank, ProductRankId> {
    List<ProductRank> findByAspectIdOrderByProductRankDesc(Integer aspectId);
}