package com.example.clinc.repo;

import com.example.clinc.entity.TypeMed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeMedRepository extends JpaRepository<TypeMed, Integer> {
}