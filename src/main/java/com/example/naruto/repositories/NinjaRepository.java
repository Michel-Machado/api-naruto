package com.example.naruto.repositories;

import com.example.naruto.entities.NinjaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface NinjaRepository extends JpaRepository<NinjaEntity, Long> {

    List<NinjaEntity> findAll();

   Optional<NinjaEntity> findById(Long id);

   int countById(Long id);

}
