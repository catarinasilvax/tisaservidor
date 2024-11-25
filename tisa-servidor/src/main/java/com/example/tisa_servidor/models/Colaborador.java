package com.example.tisa_servidor.models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "Colaboradores")
public class Colaborador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID colaboradorId;
    private String nome;
    private Date dataEntrada;

    public UUID getColaboradorId() {
        return colaboradorId;
    }

    public void setColaboradorId(UUID colaboradorId) {
        this.colaboradorId = colaboradorId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
}
