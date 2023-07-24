package com.example.naruto.repositories;

import com.example.naruto.entities.VilaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VilaRepository extends JpaRepository<VilaEntity, Long> {

        List<VilaEntity> findAll();
}
