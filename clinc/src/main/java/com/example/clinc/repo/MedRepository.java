package com.example.clinc.repo;

import com.example.clinc.entity.Med;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedRepository extends JpaRepository<Med, Integer> {
public  Med findByName(String name);

}