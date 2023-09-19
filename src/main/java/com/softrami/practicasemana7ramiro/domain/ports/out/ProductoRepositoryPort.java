package com.softrami.practicasemana7ramiro.domain.ports.out;

import com.softrami.practicasemana7ramiro.domain.model.Categoria;
import com.softrami.practicasemana7ramiro.domain.model.Producto;

import java.util.Optional;

public interface ProductoRepositoryPort {
    Producto save(Producto producto);
    Optional<Categoria> findById(Long id);
    Optional<Producto> update(Long id, Producto producto);
    boolean deleteById(Long id);
}
