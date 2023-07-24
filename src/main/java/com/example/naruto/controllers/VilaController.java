package com.example.naruto.controllers;

import com.example.naruto.entities.VilaEntity;
import com.example.naruto.repositories.VilaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vilas")
public class VilaController {

    @Autowired
    private VilaRepository vilaRepository;

    @GetMapping
    public List<VilaEntity> buscaVilas(){
      return vilaRepository.findAll();
    }


}
