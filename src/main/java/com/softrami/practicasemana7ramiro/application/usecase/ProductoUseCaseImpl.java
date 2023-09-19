package com.softrami.practicasemana7ramiro.application.usecase;

import com.softrami.practicasemana7ramiro.domain.model.Categoria;
import com.softrami.practicasemana7ramiro.domain.model.Producto;
import com.softrami.practicasemana7ramiro.domain.ports.out.ProductoRepositoryPort;

import java.util.Optional;

public class ProductoUseCaseImpl implements ProductoRepositoryPort {

    private final ProductoRepositoryPort productoRepositoryPort;

    public ProductoUseCaseImpl(ProductoRepositoryPort productoRepositoryPort) {
        this.productoRepositoryPort = productoRepositoryPort;
    }

    @Override
    public Producto save(Producto producto) {
        return productoRepositoryPort.save(producto);
    }

    @Override
    public Optional<Categoria> findById(Long id) {
        return productoRepositoryPort.findById(id);
    }

    @Override
    public Optional<Producto> update(Long id, Producto producto) {
        return productoRepositoryPort.update(id,producto);
    }

    @Override
    public boolean deleteById(Long id) {
        return productoRepositoryPort.deleteById(id);
    }
}
