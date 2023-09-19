package com.softrami.practicasemana7ramiro.application.service;

import com.softrami.practicasemana7ramiro.domain.model.Categoria;
import com.softrami.practicasemana7ramiro.domain.ports.in.CategoriaUseCase;

import java.util.Optional;

public class CategoriaService implements CategoriaUseCase {

    private final CategoriaUseCase categoriaUseCase;

    public CategoriaService(CategoriaUseCase categoriaUseCase) {
        this.categoriaUseCase = categoriaUseCase;
    }

    @Override
    public Categoria crearCategoria(Categoria categoria) {
        return categoriaUseCase.crearCategoria(categoria);
    }

    @Override
    public Optional<Categoria> getCategoria(Long id) {
        return categoriaUseCase.getCategoria(id);
    }

    @Override
    public Optional<Categoria> updateCategoria(Long id, Categoria categoria) {
        return categoriaUseCase.updateCategoria(id,categoria);
    }

    @Override
    public boolean deleteCategoria(Long id) {
        return categoriaUseCase.deleteCategoria(id);
    }
}
