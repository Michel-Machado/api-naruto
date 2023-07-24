package com.example.naruto.core;

import com.example.naruto.Dto.NinjaDto;
import com.example.naruto.adapters.NinjaPortIn;
import com.example.naruto.entities.NinjaEntity;
import com.example.naruto.repositories.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class NinjaCore implements NinjaPortIn {

    @Autowired
    private NinjaRepository ninjaRepository;



    public ResponseEntity<?> createNinja(NinjaDto ninjaDto) {
        if (!StringUtils.hasText(ninjaDto.getName())) {
            return new ResponseEntity<>("Campo: 'nome' deve ser preenchido", HttpStatus.BAD_REQUEST);
        } else if ((ninjaDto.getQuantidadeDeChacra() < 0) || (ninjaDto.getQuantidadeDeChacra() > 100)) {
            return new ResponseEntity<>("Valor inválido", HttpStatus.BAD_REQUEST);
        } else {
            NinjaEntity ninjaEntity = new NinjaEntity(null,ninjaDto.getName(),
                    ninjaDto.getQuantidadeDeChacra(), ninjaDto.getVilage());

            return new ResponseEntity<>(ninjaRepository.save(ninjaEntity), HttpStatus.CREATED);
        }
    }

    public ResponseEntity<?> getAllNinjas(){
        return new ResponseEntity<>(ninjaRepository.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<?> getNinjaById(Long id){
        if(ninjaRepository.countById(id) == 0){
          return new ResponseEntity<>(" Ninja não Encontrado", HttpStatus.BAD_REQUEST);
        }else {
            return new ResponseEntity<>(ninjaRepository.findById(id), HttpStatus.OK);
        }

    }

    public ResponseEntity<?> editNinja(NinjaEntity ninjaEntity){
        if(ninjaEntity.getId()==0){
            return new ResponseEntity<>("Id não encontrado",HttpStatus.NOT_FOUND);
        } else if (ninjaEntity.getName().equals("")) {
            return new ResponseEntity<>("Necessário informar nome", HttpStatus.BAD_REQUEST);
        } else if ((ninjaEntity.getQuantidadeDeChacra() < 0) || (ninjaEntity.getQuantidadeDeChacra() > 100)) {
            return  new ResponseEntity<>("Valor inválido",  HttpStatus.BAD_REQUEST);
        } else if ((ninjaEntity.getVilage().getId()<0) || (ninjaEntity.getVilage().getId()>4)) {
            return new ResponseEntity<>("Necessário informar vila", HttpStatus.BAD_REQUEST);
        }else {
            return new ResponseEntity<>(ninjaRepository.save(ninjaEntity), HttpStatus.OK);
        }
    }

    public ResponseEntity<?> deleteNinja(Long id){
        if(ninjaRepository.countById(id) == 0){
            return new ResponseEntity<>("Id não encontrado", HttpStatus.NOT_FOUND);
        }else {
            ninjaRepository.deleteById(id);
            return new ResponseEntity<>("Ninja Removido", HttpStatus.OK);
        }
    }



}

