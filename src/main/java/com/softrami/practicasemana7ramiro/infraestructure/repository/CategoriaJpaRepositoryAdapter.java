package com.softrami.practicasemana7ramiro.infraestructure.repository;

import com.softrami.practicasemana7ramiro.domain.model.Categoria;
import com.softrami.practicasemana7ramiro.domain.ports.out.CategoriaRepositoryPort;
import com.softrami.practicasemana7ramiro.infraestructure.entity.CategoriaEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CategoriaJpaRepositoryAdapter implements CategoriaRepositoryPort {
    private final CategoriaJpaRepository categoriaJpaRepository;

    public CategoriaJpaRepositoryAdapter(CategoriaJpaRepository categoriaJpaRepository) {
        this.categoriaJpaRepository = categoriaJpaRepository;
    }


    @Override
    public Categoria save(Categoria categoria) {
        CategoriaEntity categoriaEntity = CategoriaEntity.fromDomainModel(categoria);
        CategoriaEntity saveCategoriaEntity = categoriaJpaRepository.save(categoriaEntity);

        return saveCategoriaEntity.toDomainModel();
    }

    @Override
    public Optional<Categoria> findById(Long id) {
        return categoriaJpaRepository.findById(id)
                .map(CategoriaEntity::toDomainModel);
    }

    @Override
    public Optional<Categoria> update(Long id, Categoria categoria) {
        if (categoriaJpaRepository.existsById(categoria.getId())){
            CategoriaEntity categoriaEntity = CategoriaEntity.fromDomainModel(categoria);
            CategoriaEntity updateCategoriaEntity = categoriaJpaRepository.save(categoriaEntity);
            return Optional.of(updateCategoriaEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if (categoriaJpaRepository.existsById(id)){
            categoriaJpaRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
