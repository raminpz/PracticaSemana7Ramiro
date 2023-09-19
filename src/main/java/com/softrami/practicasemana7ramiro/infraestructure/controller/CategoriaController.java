package com.softrami.practicasemana7ramiro.infraestructure.controller;

import com.softrami.practicasemana7ramiro.application.service.CategoriaService;
import com.softrami.practicasemana7ramiro.domain.model.Categoria;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/categorias")
public class CategoriaController {

    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @PostMapping
    public ResponseEntity<Categoria> createCategoria(@RequestBody Categoria categoria){
        Categoria createCategoria = categoriaService.crearCategoria(categoria);
        return new ResponseEntity<>(createCategoria, HttpStatus.CREATED);
    }

    @GetMapping("/{categoriaId}")
    public ResponseEntity<Categoria> getCategoria(@PathVariable Long categoriaId){
        return categoriaService.getCategoria(categoriaId)
                .map(categoria -> new ResponseEntity<>(categoria,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{categoriaId}")
    public ResponseEntity<Categoria> updateCategoria (@PathVariable Long categoriaId,@RequestBody Categoria categoria){
        return categoriaService.updateCategoria(categoriaId,categoria)
                .map(cat -> new ResponseEntity<>(cat,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{categoriaId}")
    public ResponseEntity<Void> deleteCategoriaById(@PathVariable Long categoriaId){
        if (categoriaService.deleteCategoria(categoriaId)){
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
