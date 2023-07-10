package com.example.naruto.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_vila")
public class Vila {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Vila() {
    }

    public Vila(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public Vila setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Vila setName(String name) {
        this.name = name;
        return this;
    }
}
