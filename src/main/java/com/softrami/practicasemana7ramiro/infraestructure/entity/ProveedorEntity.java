package com.softrami.practicasemana7ramiro.infraestructure.entity;

import com.softrami.practicasemana7ramiro.domain.model.Proveedor;
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
@Table(name = "proveedor")
public class ProveedorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String telefono;
    private int estado;

    public static ProveedorEntity fromDomainModel(Proveedor proveedor){
        return new ProveedorEntity(proveedor.getId(), proveedor.getNombre(), proveedor.getTelefono(), proveedor.getEstado());
    }

    public Proveedor toDomainModel(){
        return new Proveedor(id,nombre,telefono,estado);
    }
}
