package com.privalia.collections;

import java.util.Map;

public class Product {

    private int idProduct;
    private String name;
    private Map<Long, Category> productList;

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Long, Category> getProductList() {
        return productList;
    }

    public void setProductList(Map<Long, Category> productList) {
        this.productList = productList;
    }
}
