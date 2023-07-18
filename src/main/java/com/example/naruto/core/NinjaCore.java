package com.example.naruto.core;

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
        } else if ((ninja.getQuantidadeDeChacra() < 0) || (ninja.getQuantidadeDeChacra() > 100)) {
            return new ResponseEntity<>("Valor inválido", HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(ninjaRepository.save(ninja), HttpStatus.CREATED);
        }
    }

    public ResponseEntity<?> buscaTodosNinjas(){
        return new ResponseEntity<>(ninjaRepository.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<?> buscaNinjaById(Long id){
        if(ninjaRepository.countById(id) == 0){
          return new ResponseEntity<>(" Ninja não Encontrado", HttpStatus.BAD_REQUEST);
        }else {
            return new ResponseEntity<>(ninjaRepository.findById(id), HttpStatus.OK);
        }

    }

    public ResponseEntity<?> editaNinja(Ninja ninja){
        if(ninja.getId()==0){
            return new ResponseEntity<>("Id não encontrado",HttpStatus.NOT_FOUND);
        } else if (ninja.getName().equals("")) {
            return new ResponseEntity<>("Necessário informar nome", HttpStatus.BAD_REQUEST);
        } else if ((ninja.getQuantidadeDeChacra() < 0) || (ninja.getQuantidadeDeChacra() > 100)) {
            return  new ResponseEntity<>("Valor inválido",  HttpStatus.BAD_REQUEST);
        } else if ((ninja.getVilage().getId()<0) || (ninja.getVilage().getId()>4)) {
            return new ResponseEntity<>("Necessário informar vila", HttpStatus.BAD_REQUEST);
        }else {
            return new ResponseEntity<>(ninjaRepository.save(ninja), HttpStatus.OK);
        }

    }
}

