package com.softrami.practicasemana7ramiro.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Categoria {
    private Long id;
    private String nombre;
    private int estado;

    public Categoria(Long id, String nombre, int estado) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
    }
}

