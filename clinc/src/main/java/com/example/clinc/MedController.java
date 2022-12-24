package com.example.clinc;

import com.example.clinc.entity.Med;
import com.example.clinc.repo.MedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/med")
@RestController

public class MedController {
    @Autowired
    private MedRepository medRepository;
    @PostMapping("addOrupdate")
    public ResponseEntity<Med>add(@RequestBody Med med){

    return new ResponseEntity<>(medRepository.save(med), HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public Optional<Med> getbyId(@PathVariable(value = "id")Integer id){
        return  medRepository.findById(id);
    }
    @DeleteMapping("/delete/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public  void deleteUser(@PathVariable(value = "id")Integer id){
        medRepository.deleteById(id);
    }
  @QueryMapping
    public List<Med>getAllmed(){
       return medRepository.findAll();
  }
}
