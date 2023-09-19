package com.softrami.practicasemana7ramiro.infraestructure.entity;

import com.softrami.practicasemana7ramiro.domain.model.Categoria;
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
@Table(name = "categoria")
public class CategoriaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private int estado;

    public static CategoriaEntity fromDomainModel(Categoria categoria){
        return new CategoriaEntity(categoria.getId(), categoria.getNombre(), categoria.getEstado());
    }

    public Categoria toDomainModel(){
        return new Categoria(id,nombre,estado);
    }
}
