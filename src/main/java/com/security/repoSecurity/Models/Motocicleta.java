package com.security.repoSecurity.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class Motocicleta extends AutoMotor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_motocicleta")
    private int id;

    @Getter @Setter
    private String tipoArranque;

    @Getter @Setter
    private int cilindraje;

    public Motocicleta(String marca, String modelo, Long numeroChazis, String tipoCombustible, int precio, String color, Long millasRecorridas, String tipoArranque, int cilindraje) {
        super(marca, modelo, numeroChazis, tipoCombustible, precio, color, millasRecorridas);
        this.tipoArranque = tipoArranque;
        this.cilindraje = cilindraje;
    }

    public Motocicleta() {
    }
}
