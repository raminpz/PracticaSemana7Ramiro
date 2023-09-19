package com.softrami.practicasemana7ramiro.domain.ports.in;

import com.softrami.practicasemana7ramiro.domain.model.Categoria;

import java.util.Optional;

public interface CategoriaUseCase {
    Categoria crearCategoria(Categoria categoria);
    Optional<Categoria> getCategoria(Long id);
    Optional<Categoria> updateCategoria(Long id, Categoria categoria);
    boolean deleteCategoria(Long id);
}
