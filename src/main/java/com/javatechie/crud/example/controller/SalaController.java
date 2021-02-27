package com.javatechie.crud.example.controller;


import com.javatechie.crud.example.entity.Product;
import com.javatechie.crud.example.entity.SalaEntity;
import com.javatechie.crud.example.service.SalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SalaController {
    @Autowired
    private SalaService salaService;


    /**
     * Métodos para adicionar uma sala no banco de dados.
     * Este metodos ultilza as funções PostMapping para
     * Este metodo ultiliza a @RequestBody para converter o corpo da chamada para a entidade SalaEntity.
     * Ele ultiliza o Serivico SalaService para savar a sala no banco de dados.
     */
    @PostMapping("/addSala")
    public SalaEntity addSalaEntity(@RequestBody SalaEntity salaEntity) {
        return salaService.saveSala(salaEntity);
    }

    @PostMapping("/addSalas")
    public List<SalaEntity> addsalas(@RequestBody List<SalaEntity> salaEntityList) {
        return salaService.saveSalas(salaEntityList);
    }

    @GetMapping("/salaEntity")
    public List<SalaEntity> findAllSalaEntity() {
        return salaService.getListSalas();
    }

    @GetMapping("/SalaById/{id}")
    public SalaEntity findSalaEntityById(@PathVariable int id) {
        return salaService.getSalaById(id);
    }

    @GetMapping("/sala/{name}")
    public SalaEntity findSalaEntityByName(@PathVariable String name) {
        return salaService.getSalaByName(name);
    }

    @DeleteMapping("sala/delete/{id}")
    public String deleteSalaEntity(@PathVariable int id) {
        return salaService.deleteSalaEntity(id);
    }

    @PutMapping("/insereAlunosNaSala")
    public SalaEntity updateAlunoAndSala(@RequestBody SalaEntity salaEntity) {
        return salaService.updateSalaEntity(salaEntity);
    }
}
