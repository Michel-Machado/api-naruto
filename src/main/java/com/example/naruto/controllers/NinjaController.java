package com.example.naruto.controllers;

import com.example.naruto.Dto.NinjaDto;
import com.example.naruto.adapters.NinjaPortIn;
import com.example.naruto.core.NinjaCore;
import com.example.naruto.entities.NinjaEntity;
import com.example.naruto.repositories.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @Autowired
    private NinjaPortIn ninjaPortIn;

    @GetMapping
    public ResponseEntity<?> buscaNinjas(){
        return ninjaPortIn.getAllNinjas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscaNinjaPorId(@PathVariable Long id) {

        return ninjaPortIn.getNinjaById(id);
    }

    @PostMapping
    public ResponseEntity<?> cadastraNinja(@RequestBody NinjaDto ninjaDto){
        return ninjaPortIn.createNinja(ninjaDto);

    }

    @PutMapping
    public ResponseEntity<?> atualizaNinja(@RequestBody NinjaEntity ninjaEntity){
        return ninjaPortIn.editNinja(ninjaEntity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluiNinja(@PathVariable Long id) {

        return ninjaPortIn.deleteNinja(id);
    }

}
