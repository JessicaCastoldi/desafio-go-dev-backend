package com.javatechie.crud.example.service;

import com.javatechie.crud.example.entity.Aluno;
import com.javatechie.crud.example.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    @Autowired
    private AlunoRepository repository;

    public Aluno saveAluno(Aluno aluno) {
        return repository.save(aluno);
    }

    public List<Aluno> saveAlunoss(List<Aluno> aluno) {
        return repository.saveAll(aluno);
    }

    public List<Aluno> getAlunoss() {
        return repository.findAll();
    }

    public Aluno getAlunoById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Aluno getAlunoByName(String name) {
        return repository.findByName(name);
    }

    public String deleteAluno(int id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }
}
