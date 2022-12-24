package com.example.clinc;


import com.example.clinc.entity.Pation;
import com.example.clinc.repo.PationRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RequestMapping("/pation")
@RestController
public class PaionController {
    @Autowired
    private PationRepository pationRepository;
    @PostMapping("/addOrupdate")
    public Pation add(@RequestBody Pation pation){

        return pationRepository.save(pation);
    }
    @GetMapping("/find/{id}")
    public Optional<Pation> getbyId(@PathVariable(value = "id")Integer id){
        return  pationRepository.findById(id);
    }
    @DeleteMapping("/deleteOrRestore/{id}/{activ}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public  void deleteUser(@PathVariable(value = "id")Integer id,@PathVariable(value = "activ") boolean activ){

            pationRepository.activateanAndUnactiveate(activ,id);


        }
   @GetMapping("findbyname/{name}")
    public Pation getpationtbyname(@PathVariable(name = "name")String name){
        return  pationRepository.findByName(name);
   }


}

