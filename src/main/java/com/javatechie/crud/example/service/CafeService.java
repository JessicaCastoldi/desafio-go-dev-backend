package com.javatechie.crud.example.service;

import com.javatechie.crud.example.entity.CafeEntity;
import com.javatechie.crud.example.repository.CafeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CafeService {

    @Autowired
    private CafeRepository repository;

    public CafeEntity saveCafe(CafeEntity cafeEntity) {
        return repository.save(cafeEntity);
    }

    public List<CafeEntity> saveCafes(List<CafeEntity> cafeEntityList) {
        return repository.saveAll(cafeEntityList);
    }

    public List<CafeEntity> getListCafes() {
        return repository.findAll();
    }

    public CafeEntity getCafeById(int id) {
        return repository.findById(id).orElse(null);
    }

    public CafeEntity getCafeByName(String name) {
        return repository.findByName(name);
    }

    public String deleteCafeEntity(int id) {
        repository.deleteById(id);
        return "Café deletada!!" + id;
    }

    public CafeEntity updateCafeEntity(CafeEntity  cafeEntity) {
        CafeEntity existeCafe = repository.findById(cafeEntity.getId()).orElse(null);
        existeCafe.setName(cafeEntity.getName());
        existeCafe.setLotacao(cafeEntity.getLotacao());
        return repository.save(existeCafe);
    }

}
