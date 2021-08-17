package com.example.jpalearning.repository;

import com.example.jpalearning.model.DeclaredAssets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeclaredAssetsRepository extends JpaRepository<DeclaredAssets, Long> {
}
