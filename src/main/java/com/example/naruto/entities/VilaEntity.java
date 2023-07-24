package com.example.naruto.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_vila")
public class VilaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public VilaEntity() {
    }

    public VilaEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public VilaEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public VilaEntity setName(String name) {
        this.name = name;
        return this;
    }
}
