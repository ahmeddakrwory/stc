package com.example.clinc.repo;

import com.example.clinc.entity.Prescription;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface PrescriptionRepository extends JpaRepository<Prescription, Integer> {
    @Transactional
    @Modifying
@Query(value = "insert into prescription(id_pation,id_Pathologic_diagnosis,mydate) values (:pid,:patId,:mdate)",nativeQuery = true)
    public  void addnNew(@Param( value = "pid")Integer pid, @Param(value = "patId")Integer patId, @Param(value = "mdate")Date pdate);
    @Transactional
    public List<Prescription > findAllByMydate(LocalDate date, Pageable page);

    @Override
    Optional<Prescription> findById(Integer integer);
}