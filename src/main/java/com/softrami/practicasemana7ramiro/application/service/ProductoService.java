package com.softrami.practicasemana7ramiro.application.service;

import com.softrami.practicasemana7ramiro.application.usecase.ProductoUseCaseImpl;
import com.softrami.practicasemana7ramiro.domain.model.Producto;
import com.softrami.practicasemana7ramiro.domain.ports.in.ProductoUseCase;

import java.util.Optional;

public class ProductoService implements ProductoUseCase {

    private final ProductoUseCase productoUseCase;

    public ProductoService(ProductoUseCase productoUseCase) {
        this.productoUseCase = productoUseCase;
    }

    @Override
    public Producto crearProducto(Producto producto) {
        return productoUseCase.crearProducto(producto);
    }

    @Override
    public Optional<Producto> getProducto(Long id) {
        return productoUseCase.getProducto(id);
    }

    @Override
    public Optional<Producto> updateProducto(Long id, Producto producto) {
        return productoUseCase.updateProducto(id,producto);
    }

    @Override
    public boolean deleteProducto(Long id) {
        return productoUseCase.deleteProducto(id);
    }
}
