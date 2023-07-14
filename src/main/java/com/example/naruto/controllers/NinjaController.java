package com.example.naruto.controllers;

import com.example.naruto.entities.Ninja;
import com.example.naruto.repositories.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @Autowired
    private NinjaRepository ninjaRepository;

    @GetMapping
    public List<Ninja> getNinja(){
        return ninjaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Ninja> FindById(@PathVariable Long id) {
        return ninjaRepository.findById(id);
    }

    @PostMapping
    public Ninja criaNinja(@RequestBody Ninja ninja){
        return ninjaRepository.save(ninja);

    }



}
