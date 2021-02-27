package com.javatechie.crud.example.controller;

import com.javatechie.crud.example.entity.Aluno;
import com.javatechie.crud.example.entity.Product;
import com.javatechie.crud.example.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlunoController {
    @Autowired
    private AlunoService service;
    @PostMapping("/addAluno")
    public Aluno addAluno(@RequestBody Aluno aluno) {
        return service.saveAluno(aluno);
    }

    @PostMapping("/addAlunos")
    public List<Aluno> addAlunos(@RequestBody List<Aluno> alunos) {
        return service.saveAlunoss(alunos);
    }

    @GetMapping("/aluno")
    public List<Aluno> findAllAlunos() {
        return service.getAlunoss();
    }

    @GetMapping("/alunoById/{id}")
    public Aluno findAlunoById(@PathVariable int id) {
        return service.getAlunoById(id);
    }

    @GetMapping("/aluno/{name}")
    public Aluno findAlunoByName(@PathVariable String name) {
        return service.getAlunoByName(name);
    }

    @DeleteMapping("aluno/delete/{id}")
    @CrossOrigin(origins = "http://localhost:9191")
    public String deleteAluno(@PathVariable int id) {
        return service.deleteAluno(id);
    }
}
