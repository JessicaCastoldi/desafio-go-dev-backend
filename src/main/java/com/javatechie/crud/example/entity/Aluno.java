package com.javatechie.crud.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ALUNO_TABLE")
public class Aluno {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String sobrenome;
    private String telefone;
    private String email;

}
