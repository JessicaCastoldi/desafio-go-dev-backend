package com.javatechie.crud.example.repository;

import com.javatechie.crud.example.entity.Aluno;

import org.springframework.data.jpa.repository.JpaRepository;

    public interface AlunoRepository extends JpaRepository<Aluno,Integer> {
        Aluno findByName(String name);
    }

