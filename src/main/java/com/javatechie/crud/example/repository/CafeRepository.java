package com.javatechie.crud.example.repository;
import com.javatechie.crud.example.entity.CafeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CafeRepository extends JpaRepository<CafeEntity,Integer>{


        CafeEntity findByName(String name);


}
