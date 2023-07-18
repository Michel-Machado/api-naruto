package com.example.naruto.controllers;

import com.example.naruto.core.NinjaCore;
import com.example.naruto.entities.Ninja;
import com.example.naruto.repositories.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @Autowired
    private NinjaRepository ninjaRepository;
    @Autowired
    private NinjaCore ninjaCore;

    @GetMapping
    public ResponseEntity<?> buscaNinjas(){
        return ninjaCore.getAllNinjas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscaNinjaPorId(@PathVariable Long id) {

        return ninjaCore.getNinjaById(id);
    }

    @PostMapping
    public ResponseEntity<?> cadastraNinja(@RequestBody Ninja ninja){
        return ninjaCore.CreateNinja(ninja);

    }

    @PutMapping
    public ResponseEntity<?> atualizaNinja(@RequestBody Ninja ninja){
        return ninjaCore.editNinja(ninja);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluiNinja(@PathVariable Long id) {

        return ninjaCore.deleteNinja(id);
    }

}
