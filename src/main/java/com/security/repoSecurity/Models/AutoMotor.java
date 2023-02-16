package com.security.repoSecurity.Models;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class AutoMotor {

   /* @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_carro")
    private int id;
       */   
    private String marca;


    private String modelo;


    private Long numeroChazis;


    private String tipoCombustible;


    private int precio;


    private String color;


    private Long millasRecorridas;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Long getNumeroChazis() {
        return numeroChazis;
    }

    public void setNumeroChazis(Long numeroChazis) {
        this.numeroChazis = numeroChazis;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Long getMillasRecorridas() {
        return millasRecorridas;
    }

    public void setMillasRecorridas(Long millasRecorridas) {
        this.millasRecorridas = millasRecorridas;
    }

    public AutoMotor(String marca, String modelo, Long numeroChazis, String tipoCombustible, int precio, String color, Long millasRecorridas) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroChazis = numeroChazis;
        this.tipoCombustible = tipoCombustible;
        this.precio = precio;
        this.color = color;
        this.millasRecorridas = millasRecorridas;
    }

    public AutoMotor() {
    }
}
