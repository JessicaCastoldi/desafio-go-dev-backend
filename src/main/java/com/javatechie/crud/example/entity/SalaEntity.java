package com.javatechie.crud.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "SALA_TABLE")
public class SalaEntity {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int numero;
    @ManyToMany()
    private List<Aluno> aluno;
    private int lotacao;
}
