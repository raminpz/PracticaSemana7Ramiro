package com.softrami.practicasemana7ramiro.domain.ports.in;

import com.softrami.practicasemana7ramiro.domain.model.Producto;

import java.util.Optional;

public interface ProductoUseCase {
    Producto crearProducto(Producto producto);
    Optional<Producto> getProducto(Long id);
    Optional<Producto> updateProducto(Long id, Producto producto);
    boolean deleteProducto(Long id);
}
