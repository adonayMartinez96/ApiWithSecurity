package com.security.repoSecurity.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "productos")
@Entity
public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Getter  @Setter
    private String name;

    @Getter  @Setter
    private int Stock;

    @Getter  @Setter
    private int categoria;

    public Productos() {
    }

    public Productos(String name, int stock, int categoria) {
        this.name = name;
        Stock = stock;
        this.categoria = categoria;
    }
}
