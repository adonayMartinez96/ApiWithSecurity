package com.security.repoSecurity.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class Carro extends AutoMotor    {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_carro")
    private int id;

    @Getter @Setter
    private int numeroPuertas;

    public Carro(String marca, String modelo, Long numeroChazis, String tipoCombustible, int precio, String color, Long millasRecorridas, int numeroPuertas) {
   //     super(marca, modelo, numeroChazis, tipoCombustible, precio, color, millasRecorridas);
        this.numeroPuertas = numeroPuertas;
    }

    public Carro() {
    }
}
