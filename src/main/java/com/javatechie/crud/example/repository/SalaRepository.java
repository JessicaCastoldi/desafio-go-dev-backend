package com.javatechie.crud.example.repository;

import com.javatechie.crud.example.entity.SalaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaRepository extends JpaRepository<SalaEntity, Integer> {
    SalaEntity findByName(String name);
}
