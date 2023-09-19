package com.softrami.practicasemana7ramiro.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Producto {
    private Long id;
    private String nombre;
    private String descripcion;
    private double precio;

    private Categoria categoria;
    private Proveedor proveedor;

    public Producto(Long id, String nombre, String descripcion, double precio, Categoria categoria, Proveedor proveedor) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
        this.proveedor = proveedor;
    }
}
