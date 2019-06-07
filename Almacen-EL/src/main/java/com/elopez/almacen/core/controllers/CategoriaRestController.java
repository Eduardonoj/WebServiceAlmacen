package com.elopez.almacen.core.controllers;

import com.elopez.almacen.core.models.entity.Categoria;
import com.elopez.almacen.core.models.services.ICategoriaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CategoriaRestController {
    private final ICategoriaService categoriaService;

    public CategoriaRestController(ICategoriaService categoriaService){
        this.categoriaService = categoriaService;
    }

    @GetMapping("/categorias")
    public List<Categoria> index(){
        return this.categoriaService.findAll();
    }
}
