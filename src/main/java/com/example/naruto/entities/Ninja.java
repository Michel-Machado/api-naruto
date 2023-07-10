package com.example.naruto.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_ninjaa")
public class Ninja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer taijutsu;

    @ManyToOne
    @JoinColumn(name = "vila_id")
    private Vila vilage;

    public Ninja() {
    }

    public Ninja(Long id, String name, Integer taijutsu, Vila vilage) {
        this.id = id;
        this.name = name;
        this.taijutsu = taijutsu;
        this.vilage = vilage;
    }

    public Long getId() {
        return id;
    }

    public Ninja setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Ninja setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getTaijutsu() {
        return taijutsu;
    }

    public Ninja setTaijutsu(Integer taijutsu) {
        this.taijutsu = taijutsu;
        return this;
    }

    public Vila getVilage() {
        return vilage;
    }

    public Ninja setVilage(Vila vilage) {
        this.vilage = vilage;
        return this;
    }
}
