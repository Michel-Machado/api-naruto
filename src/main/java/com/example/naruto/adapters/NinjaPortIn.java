package com.example.naruto.adapters;

import com.example.naruto.Dto.NinjaDto;
import com.example.naruto.entities.NinjaEntity;
import org.springframework.http.ResponseEntity;

public interface NinjaPortIn {

    ResponseEntity<?> createNinja(NinjaDto ninjaDto);
    ResponseEntity<?> getAllNinjas();
    ResponseEntity<?> getNinjaById(Long id);
    ResponseEntity<?> editNinja(NinjaEntity ninjaEntity);

    ResponseEntity<?> deleteNinja(Long id);


}
