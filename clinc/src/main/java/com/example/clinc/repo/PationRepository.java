package com.example.clinc.repo;

import com.example.clinc.entity.Pation;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PationRepository extends JpaRepository<Pation, Integer> {
   public Pation findByName(String name);
   @Transactional
   @Modifying
   @Query("UPDATE Pation p SET p.active = :active WHERE p.id = :id")
    public void activateanAndUnactiveate(@Param(value = "active")Boolean active,@Param(value = "id") Integer id);
}