package com.example.clinc;

import com.example.clinc.entity.Pation;
import com.example.clinc.entity.Prescription;
import com.example.clinc.inputbeans.PrescriptionInput;
import com.example.clinc.repo.PationRepository;
import com.example.clinc.repo.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RequestMapping("/prescription")
@RestController
public class prescriptionController {
    @Autowired
    PrescriptionRepository prescriptionRepository;


    @PostMapping("/add")

    public ResponseEntity add (@RequestBody PrescriptionInput prescriptionInput){
        prescriptionRepository.addnNew(prescriptionInput.getPid(),prescriptionInput.getDiagonsisId(), new Date());
    return  new ResponseEntity("add", HttpStatus.OK);
    }

@QueryMapping
    public List<Prescription> findPbydate(@Argument PrescriptionInput prs){


    PageRequest pageRequest=PageRequest.of(prs.getPageNumber(),10);
    return  prescriptionRepository.findAllByMydate(prs.dateparser(),  pageRequest);

}
@QueryMapping
    public Optional <Prescription> findPById(@Argument Integer id){

        return prescriptionRepository.findById(id);
}
}
