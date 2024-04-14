package com.RestCrud.ProductManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RestCrud.ProductManagement.Dao.ProductsDao;
import com.RestCrud.ProductManagement.Entity.products;

import jakarta.transaction.Transactional;

@Service
public class ProductsServiceImpl implements ProductsService{

    @Autowired
    private ProductsDao dao;

    @Override
    @Transactional
    public List<products> getAll() {
        
        return dao.getAll();
    }

    @Override
    @Transactional
    public products findById(int id) {
        return dao.findById(id);
    }

    @Override
    @Transactional
    public products save(products newpProduct) {
        return dao.save(newpProduct);
    }

    @Override
    @Transactional
    public products updateproduct(products upproduct) {
        return dao.updateproduct(upproduct);
    }

    @Override
    @Transactional
    public String deletebyId(products deleteproduct) {
        return dao.deletebyId(deleteproduct);
    }
}
