package com.RestCrud.ProductManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RestCrud.ProductManagement.Entity.products;
import com.RestCrud.ProductManagement.Exception.ProductNotFoundExcepption;
import com.RestCrud.ProductManagement.Service.ProductsService;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

    @Autowired
    private ProductsService productsService;
    
    @GetMapping("/allProducts")
    public List<products> getAllProducts(){
        return productsService.getAll();
    }

    @GetMapping("/getById/{id}")
    public products getById(@PathVariable int id){
        if(id<0){
            throw new ProductNotFoundExcepption("Invalid Product ID:"+id);
        }
        return productsService.findById(id);
    }

    @PostMapping("/addProduct")
    public products AddProduct(@RequestBody products newproduct){
        newproduct.setId(0);
        products thenewProduct= productsService.save(newproduct);
        return thenewProduct;
    }

    @PutMapping("/modifyproduct")
    public products updateProduct(@RequestBody products uProducts){
        products updatedproduct= productsService.updateproduct(uProducts);
        return updatedproduct;
    }

    @GetMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable int id){
        products deletableproduct= productsService.findById(id);
        if(deletableproduct == null){
            throw new ProductNotFoundExcepption("Product not found with ID:"+id);
        }
        return productsService.deletebyId(deletableproduct);
    }

}
