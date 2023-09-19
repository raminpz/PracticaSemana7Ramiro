package com.softrami.practicasemana7ramiro.infraestructure.repository;

import com.softrami.practicasemana7ramiro.infraestructure.entity.CategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaJpaRepository extends JpaRepository<CategoriaEntity,Long> {
}
