package com.softrami.practicasemana7ramiro.domain.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
public class Proveedor {
    private Long id;
    private String nombre;
    private String telefono;
    private int estado;

    public Proveedor(Long id, String nombre, String telefono, int estado) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.estado = estado;
    }
}
