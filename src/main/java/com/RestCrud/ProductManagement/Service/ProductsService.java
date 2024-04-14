package com.RestCrud.ProductManagement.Service;

import java.util.List;



import com.RestCrud.ProductManagement.Entity.products;


public interface ProductsService {

    List<products> getAll();
    products findById(int id);

    products save(products newpProduct);

    products updateproduct(products upproduct);

    String deletebyId(products deleteproduct);
} 