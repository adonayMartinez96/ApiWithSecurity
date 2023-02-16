package com.security.repoSecurity.DTO;

import lombok.Getter;
import lombok.Setter;

public class AutoDTO {
    @Getter @Setter
    private String marca;

    @Getter @Setter
    private String modelo;

    @Getter @Setter
    private Long numeroChazis;

    @Getter @Setter
    private String tipoCombustible;

    @Getter @Setter
    private int precio;

    @Getter @Setter
    private String color;

    @Getter @Setter
    private Long millasRecorridas;

}
