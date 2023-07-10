package com.example.naruto.repositories;

import com.example.naruto.entities.Ninja;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<Ninja, Long> {

}
