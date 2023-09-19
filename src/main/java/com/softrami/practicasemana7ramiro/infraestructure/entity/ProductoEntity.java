package com.softrami.practicasemana7ramiro.infraestructure.entity;

import com.softrami.practicasemana7ramiro.domain.model.Producto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "producto")
public class ProductoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    private double precio;
    @ManyToOne
    private CategoriaEntity categoriaEntity;
    @ManyToOne
    private ProveedorEntity proveedorEntity;

    public static ProductoEntity fromDomainModel(Producto producto){
        return new ProductoEntity(producto.getId(), producto.getNombre(),producto.getDescripcion(), producto.getPrecio(), CategoriaEntity.fromDomainModel(producto.getCategoria()),ProveedorEntity.fromDomainModel(producto.getProveedor()));
    }

    public Producto toDomainModel(Producto producto){
        return new Producto(id,nombre,descripcion,precio,categoriaEntity.toDomainModel(),proveedorEntity.toDomainModel());
    }
}
