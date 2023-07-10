package com.example.naruto.controllers;

import com.example.naruto.entities.Ninja;
import com.example.naruto.entities.Vila;
import com.example.naruto.repositories.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @Autowired
    private NinjaRepository ninjaRepository;
    @GetMapping
    public List<Ninja> getNinja(){


        List<Ninja> ninjaList = ninjaRepository.findAll();
        return ninjaList ;
    }

    @PostMapping
    public Ninja


}
