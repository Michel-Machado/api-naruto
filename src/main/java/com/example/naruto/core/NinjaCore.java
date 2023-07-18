package com.example.naruto.core;

import com.example.naruto.entities.Mensagem;
import com.example.naruto.entities.Ninja;
import com.example.naruto.repositories.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class NinjaCore {

    @Autowired
    private NinjaRepository ninjaRepository;

    public ResponseEntity<?> cadastrar(Ninja ninja) {
        if (ninja.getName().equals("")) {
            return new ResponseEntity<>("Campo: 'nome' deve ser preenchido", HttpStatus.BAD_REQUEST);
        } else if ((ninja.getTaijutsu() < 0) || (ninja.getTaijutsu() > 100)) {
            return new ResponseEntity<>("Valor inválido", HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(ninjaRepository.save(ninja), HttpStatus.CREATED);
        }
    }
}

