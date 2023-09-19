package com.softrami.practicasemana7ramiro.application.usecase;

import com.softrami.practicasemana7ramiro.domain.model.Proveedor;
import com.softrami.practicasemana7ramiro.domain.ports.out.ProveedorRepositoryPort;

import java.util.Optional;

public class ProveedorUseCaseImpl implements ProveedorRepositoryPort {
    private final ProveedorRepositoryPort proveedorRepositoryPort;

    public ProveedorUseCaseImpl(ProveedorRepositoryPort proveedorRepositoryPort) {
        this.proveedorRepositoryPort = proveedorRepositoryPort;
    }

    @Override
    public Proveedor save(Proveedor proveedor) {
        return proveedorRepositoryPort.save(proveedor);
    }

    @Override
    public Optional<Proveedor> findById(Long id) {
        return proveedorRepositoryPort.findById(id);
    }

    @Override
    public Optional<Proveedor> update(Long id, Proveedor proveedor) {
        return proveedorRepositoryPort.update(id,proveedor);
    }

    @Override
    public boolean deleteById(Long id) {
        return proveedorRepositoryPort.deleteById(id);
    }
}
