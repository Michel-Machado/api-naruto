package com.example.naruto.domain;

import com.example.naruto.Dto.NinjaDto;
import com.example.naruto.entities.VilaEntity;

public class Ninja {
    private String name;
    private Integer quantidadeDeChacra;
    private VilaEntity vilage;

    public Ninja() {
    }

    public Ninja(String name, Integer quantidadeDeChacra, VilaEntity vilage) {
        this.name = name;
        this.quantidadeDeChacra = quantidadeDeChacra;
        this.vilage = vilage;
    }

    public String getName() {
        return name;
    }

    public Ninja setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getQuantidadeDeChacra() {
        return quantidadeDeChacra;
    }

    public Ninja setQuantidadeDeChacra(Integer quantidadeDeChacra) {
        this.quantidadeDeChacra = quantidadeDeChacra;
        return this;
    }

    public VilaEntity getVilage() {
        return vilage;
    }

    public Ninja setVilage(VilaEntity vilage) {
        this.vilage = vilage;
        return this;
    }
}
