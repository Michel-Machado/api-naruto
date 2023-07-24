package com.example.naruto.Dto;

import com.example.naruto.domain.Ninja;
import com.example.naruto.entities.VilaEntity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class NinjaDto extends Ninja {

    private String name;
    private Integer quantidadeDeChacra;
    private VilaEntity vilage;

    public NinjaDto() {
    }

    public NinjaDto(String name, Integer quantidadeDeChacra, VilaEntity vilage) {
        this.name = name;
        this.quantidadeDeChacra = quantidadeDeChacra;
        this.vilage = vilage;
    }

    public String getName() {
        return name;
    }

    public NinjaDto setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getQuantidadeDeChacra() {
        return quantidadeDeChacra;
    }

    public NinjaDto setQuantidadeDeChacra(Integer quantidadeDeChacra) {
        this.quantidadeDeChacra = quantidadeDeChacra;
        return this;
    }

    public VilaEntity getVilage() {
        return vilage;
    }

    public NinjaDto setVilage(VilaEntity vilage) {
        this.vilage = vilage;
        return this;
    }
}
