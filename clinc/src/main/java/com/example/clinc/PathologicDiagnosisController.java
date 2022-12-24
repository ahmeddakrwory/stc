package com.example.clinc;

import com.example.clinc.entity.PathologicDiagnosis;
import com.example.clinc.repo.PathologicDiagnosisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/pationdiagonsis")
@RestController

public class PathologicDiagnosisController {
    @Autowired
    private PathologicDiagnosisRepository pathologicDiagnosisRepository;
   @PostMapping("/addorupdate")
    public PathologicDiagnosis addORupdate(@RequestBody PathologicDiagnosis pathologicDiagnosis){
        return  pathologicDiagnosisRepository.save(pathologicDiagnosis);
    }
    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id")Integer id){pathologicDiagnosisRepository.deleteById(id);}
    @GetMapping("/find/{id}")
    public Optional<PathologicDiagnosis> findbyid(@PathVariable(value = "id") Integer id ){
      return pathologicDiagnosisRepository.findById(id);
    }
}
