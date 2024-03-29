package com.elopez.almacen.core.models.services;

import com.elopez.almacen.core.models.dao.ICategoriaDao;
import com.elopez.almacen.core.models.entity.Categoria;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements ICategoriaService{
    private final ICategoriaDao categoriaDao;


    public CategoriaServiceImpl(ICategoriaDao categoriaDao) {
         this.categoriaDao = categoriaDao;
    }

    @Override
    public List<Categoria> findAll() {
        return this.categoriaDao.findAll();
    }

    @Override
    public Page<Categoria> findAll(Pageable pageable) {
        return this.categoriaDao.findAll(pageable);
    }

    @Override
    public Categoria save(Categoria categoria) {
        return this.categoriaDao.save(categoria);
    }

    @Override
    public Categoria findById(Long id) {
        return this.categoriaDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Categoria categoria) {
        this.categoriaDao.delete(categoria);

    }
}
