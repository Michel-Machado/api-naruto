package com.example.naruto.controllers;

import com.example.naruto.core.NinjaCore;
import com.example.naruto.entities.Ninja;
import com.example.naruto.repositories.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @Autowired
    private NinjaRepository ninjaRepository;
    @Autowired
    private NinjaCore ninjaCore;

    @GetMapping
    public ResponseEntity<?> getNinja(){
        return ninjaCore.buscaTodosNinjas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> FindById(@PathVariable Long id) {

        return ninjaCore.buscaNinjaById(id);
    }

    @PostMapping
    public ResponseEntity<?> cadastroNinja(@RequestBody Ninja ninja){
        return ninjaCore.cadastrar(ninja);

    }

    @PutMapping
    public ResponseEntity<?> atualizaNinja(@RequestBody Ninja ninja){
        return ninjaCore.editaNinja(ninja);
    }

    @DeleteMapping("/{id}")
    public void deleteNinja(@PathVariable Long id) {
        ninjaRepository.deleteById(id);
    }

}
