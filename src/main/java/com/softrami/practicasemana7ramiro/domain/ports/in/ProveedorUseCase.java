package com.softrami.practicasemana7ramiro.domain.ports.in;

import com.softrami.practicasemana7ramiro.domain.model.Proveedor;

import java.util.Optional;

public interface ProveedorUseCase {
    Proveedor crearProveedor(Proveedor proveedor);
    Optional<Proveedor> getProveedor(Long id);
    Optional<Proveedor> updateProveedor(Long id, Proveedor proveedor);
    boolean deleteProveedor(Long id);
}
