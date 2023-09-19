package com.softrami.practicasemana7ramiro.application.service;

import com.softrami.practicasemana7ramiro.application.usecase.ProveedorUseCaseImpl;
import com.softrami.practicasemana7ramiro.domain.model.Proveedor;
import com.softrami.practicasemana7ramiro.domain.ports.in.ProveedorUseCase;

import java.util.Optional;

public class ProveedorService implements ProveedorUseCase {

    private final ProveedorUseCase proveedorUseCase;

    public ProveedorService(ProveedorUseCaseImpl proveedorUseCase) {
        this.proveedorUseCase = (ProveedorUseCase) proveedorUseCase;
    }

    @Override
    public Proveedor crearProveedor(Proveedor proveedor) {
        return proveedorUseCase.crearProveedor(proveedor);
    }

    @Override
    public Optional<Proveedor> getProveedor(Long id) {
        return proveedorUseCase.getProveedor(id);
    }

    @Override
    public Optional<Proveedor> updateProveedor(Long id, Proveedor proveedor) {
        return proveedorUseCase.updateProveedor(id,proveedor);
    }

    @Override
    public boolean deleteProveedor(Long id) {
        return proveedorUseCase.deleteProveedor(id);
    }
}
