package com.RestCrud.ProductManagement.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class products {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "p_name")
    private String p_name;

    @Column(name = "p_price")
    private int p_price;

    @Column(name = "p_category")
    private String p_category;

    @Column(name = "seller_name")
    private String seller_name;

    @Column(name = "quantity_available")
    private int quantity_available;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public int getP_price() {
        return p_price;
    }

    public void setP_price(int p_price) {
        this.p_price = p_price;
    }

    public String getP_category() {
        return p_category;
    }

    public void setP_category(String p_category) {
        this.p_category = p_category;
    }

    public String getSeller_name() {
        return seller_name;
    }

    public void setSeller_name(String seller_name) {
        this.seller_name = seller_name;
    }

    public int getQuantity_available() {
        return quantity_available;
    }

    public void setQuantity_available(int quantity_available) {
        this.quantity_available = quantity_available;
    }

    public products(int id, String p_name, int p_price, String p_category, String seller_name, int quantity_available) {
        this.id = id;
        this.p_name = p_name;
        this.p_price = p_price;
        this.p_category = p_category;
        this.seller_name = seller_name;
        this.quantity_available = quantity_available;
    }

    @Override
    public String toString() {
        return "products [id=" + id + ", p_name=" + p_name + ", p_price=" + p_price + ", p_category=" + p_category
                + ", seller_name=" + seller_name + ", quantity_available=" + quantity_available + "]";
    }

    public products() {
    }

    
}
