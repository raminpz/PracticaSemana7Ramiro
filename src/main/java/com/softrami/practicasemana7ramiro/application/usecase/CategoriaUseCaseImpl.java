package com.softrami.practicasemana7ramiro.application.usecase;

import com.softrami.practicasemana7ramiro.domain.model.Categoria;
import com.softrami.practicasemana7ramiro.domain.ports.in.CategoriaUseCase;
import com.softrami.practicasemana7ramiro.domain.ports.out.CategoriaRepositoryPort;

import java.util.Optional;

public class CategoriaUseCaseImpl implements CategoriaUseCase {

    private final CategoriaRepositoryPort categoriaRepositoryPort;

    public CategoriaUseCaseImpl(CategoriaRepositoryPort categoriaRepositoryPort) {
        this.categoriaRepositoryPort = categoriaRepositoryPort;
    }

    @Override
    public Categoria crearCategoria(Categoria categoria) {
        return categoriaRepositoryPort.save(categoria);
    }

    @Override
    public Optional<Categoria> getCategoria(Long id) {
        return categoriaRepositoryPort.findById(id);
    }

    @Override
    public Optional<Categoria> updateCategoria(Long id, Categoria categoria) {
        return categoriaRepositoryPort.update(id,categoria);
    }

    @Override
    public boolean deleteCategoria(Long id) {
        return categoriaRepositoryPort.deleteById(id);
    }
}
