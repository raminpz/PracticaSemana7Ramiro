package com.softrami.practicasemana7ramiro.domain.ports.out;

import com.softrami.practicasemana7ramiro.domain.model.Proveedor;

import java.util.Optional;

public interface ProveedorRepositoryPort {
    Proveedor save(Proveedor proveedor);
    Optional<Proveedor> findById(Long id);
    Optional<Proveedor> update(Long id, Proveedor proveedor);
    boolean deleteById(Long id);

}
