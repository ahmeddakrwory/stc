package com.example.clinc.services;

import com.example.clinc.entity.Pation;
import com.example.clinc.repo.PationRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PationService {
@Autowired
    PationRepository pationRepository;
@Transactional
public void activateAnddeactivate(boolean active,Integer id){
   pationRepository.activateanAndUnactiveate(active,id);

}
}
