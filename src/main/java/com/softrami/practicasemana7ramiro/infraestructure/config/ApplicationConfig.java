package com.softrami.practicasemana7ramiro.infraestructure.config;

import com.softrami.practicasemana7ramiro.application.service.CategoriaService;
import com.softrami.practicasemana7ramiro.application.service.ProductoService;
import com.softrami.practicasemana7ramiro.application.service.ProveedorService;
import com.softrami.practicasemana7ramiro.application.usecase.CategoriaUseCaseImpl;
import com.softrami.practicasemana7ramiro.application.usecase.ProductoUseCaseImpl;
import com.softrami.practicasemana7ramiro.application.usecase.ProveedorUseCaseImpl;
import com.softrami.practicasemana7ramiro.domain.ports.in.ProductoUseCase;
import com.softrami.practicasemana7ramiro.domain.ports.out.CategoriaRepositoryPort;
import com.softrami.practicasemana7ramiro.domain.ports.out.ProductoRepositoryPort;
import com.softrami.practicasemana7ramiro.domain.ports.out.ProveedorRepositoryPort;
import com.softrami.practicasemana7ramiro.infraestructure.repository.CategoriaJpaRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public CategoriaService categoriaService(CategoriaRepositoryPort categoriaRepositoryPort){
        return new CategoriaService(new CategoriaUseCaseImpl(categoriaRepositoryPort));
    }

    @Bean
    public CategoriaRepositoryPort categoriaRepositoryPort(CategoriaJpaRepositoryAdapter categoriaJpaRepositoryAdapter){
        return categoriaJpaRepositoryAdapter;
    }
/*
    @Bean
    public ProductoService productoService(ProductoRepositoryPort productoRepositoryPort){
        return new ProductoService((ProductoUseCase) new ProductoUseCaseImpl(productoRepositoryPort));
    }

    @Bean
    public ProductoRepositoryPort productoRepositoryPort(ProductoJpaRepositoryAdapter productoJpaRepositoryAdapter){
        return productoJpaRepositoryAdapter;
    }

    @Bean
    public ProveedorService proveedorService(ProveedorRepositoryPort proveedorRepositoryPort){
        return new ProveedorService(new ProveedorUseCaseImpl(proveedorRepositoryPort));
    }

    @Bean
    public ProveedorRepositoryPort proveedorRepositoryPort(ProveedorRepositoryPort proveedorRepositoryPort){
        return proveedorRepositoryPort;
    }*/
}
