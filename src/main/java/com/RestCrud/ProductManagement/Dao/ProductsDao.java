package com.RestCrud.ProductManagement.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.RestCrud.ProductManagement.Entity.products;

@Repository
public interface ProductsDao {
    List<products> getAll();

    products findById(int id);

    products save(products newpProduct);

    products updateproduct(products upproduct);

    String deletebyId(products deleteproduct);
}