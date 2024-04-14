package com.RestCrud.ProductManagement.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RestCrud.ProductManagement.Entity.products;
import com.RestCrud.ProductManagement.Exception.ProductNotFoundExcepption;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Service
public class ProductsDaoImpl implements ProductsDao{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<products> getAll() {
        TypedQuery<products> theQuery= entityManager.createQuery("from products",products.class);
        List<products> pList=theQuery.getResultList();
        return pList;
    }

    @Override
    public products findById(int id) {
        products pbyid= entityManager.find(products.class, id);
        if(pbyid == null){
            throw new ProductNotFoundExcepption("Product Not Found for the ID:"+id);
        }
        return pbyid;
    }

    @Override
    public products save(products newpProduct) {
        entityManager.persist(newpProduct);
        return newpProduct;
    }

    @Override
    public products updateproduct(products upproduct) {
        entityManager.merge(upproduct);
        return upproduct;
    }

    @Override
    public String deletebyId(products deleteproduct) {
        entityManager.remove(deleteproduct);
        return "Deleted employee";
    }
}
