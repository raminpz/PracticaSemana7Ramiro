package com.softrami.practicasemana7ramiro.domain.ports.out;

import com.softrami.practicasemana7ramiro.domain.model.Categoria;

import java.util.Optional;

public interface CategoriaRepositoryPort {
    Categoria save(Categoria categoria);
    Optional<Categoria> findById(Long id);
    Optional<Categoria> update(Long id, Categoria categoria);
    boolean deleteById(Long id);

}
