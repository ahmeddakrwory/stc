package com.example.clinc.repo;

import com.example.clinc.entity.PrescriptionDetail;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrescriptionDetailRepository extends JpaRepository<PrescriptionDetail, Integer> {
@Transactional
    public  PrescriptionDetail findByIdMed(Integer id);
}