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
    public List<Ninja> getNinja(){
        return ninjaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Ninja> FindById(@PathVariable Long id) {
        return ninjaRepository.findById(id);
    }


    @PostMapping
    public ResponseEntity<?> cadastroNinja(@RequestBody Ninja ninja){
        return ninjaCore.cadastrar(ninja);

    }

    @PutMapping
    public Ninja atualizaNinja(@RequestBody Ninja ninja){
        return ninjaRepository.save(ninja);
    }

    @DeleteMapping("/{id}")
    public void deleteNinja(@PathVariable Long id) {
        ninjaRepository.deleteById(id);
    }

}
