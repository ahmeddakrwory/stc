package com.example.clinc.repo;

import com.example.clinc.entity.PathologicDiagnosis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PathologicDiagnosisRepository extends JpaRepository<PathologicDiagnosis, Integer> {
}