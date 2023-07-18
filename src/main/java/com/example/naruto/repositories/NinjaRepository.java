package com.example.naruto.repositories;

import com.example.naruto.entities.Ninja;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface NinjaRepository extends JpaRepository<Ninja, Long> {

    List<Ninja> findAll();

   Optional<Ninja> findById(Long id);

   int countById(Long id);

}
