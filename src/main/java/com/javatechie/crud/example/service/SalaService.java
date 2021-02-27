package com.javatechie.crud.example.service;

import com.javatechie.crud.example.entity.Aluno;
import com.javatechie.crud.example.entity.SalaEntity;
import com.javatechie.crud.example.repository.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaService {

    @Autowired
    private SalaRepository repository;

    public SalaEntity saveSala(SalaEntity salaEntity) {
        return repository.save(salaEntity);
    }

    public List<SalaEntity> saveSalas(List<SalaEntity> salaEntityList) {
        return repository.saveAll(salaEntityList);
    }

    public List<SalaEntity> getListSalas() {
        return repository.findAll();
    }

    public SalaEntity getSalaById(int id) {
        return repository.findById(id).orElse(null);
    }

    public SalaEntity getSalaByName(String name) {
        return repository.findByName(name);
    }

    public String deleteSalaEntity(int id) {
        repository.deleteById(id);
        return "Sala deletada!!" + id;
    }

    public SalaEntity updateSalaEntity(SalaEntity salaEntity) {
        SalaEntity existeSala = repository.findById(salaEntity.getId()).orElse(null);
        existeSala.setAluno(salaEntity.getAluno());
        return repository.save(existeSala);
    }




    public Aluno getAlunoByNameAndSala() {
        return null;
    }

    public Aluno saveAlunoAndSala() {
        return null;
    }
}
