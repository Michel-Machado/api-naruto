package com.example.naruto.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_ninjaa")
public class NinjaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer quantidadeDeChacra;

    @ManyToOne
    @JoinColumn(name = "vila_id")
    private VilaEntity vilage;

    public NinjaEntity() {
    }

    public NinjaEntity(Long id, String name, Integer quantidadeDeChacra, VilaEntity vilage) {
        this.id = id;
        this.name = name;
        this.quantidadeDeChacra = quantidadeDeChacra;
        this.vilage = vilage;
    }

    public Long getId() {
        return id;
    }

    public NinjaEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public NinjaEntity setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getQuantidadeDeChacra() {
        return quantidadeDeChacra;
    }

    public NinjaEntity setQuantidadeDeChacra(Integer quantidadeDeChacra) {
        this.quantidadeDeChacra = quantidadeDeChacra;
        return this;
    }

    public VilaEntity getVilage() {
        return vilage;
    }

    public NinjaEntity setVilage(VilaEntity vilage) {
        this.vilage = vilage;
        return this;
    }
}
