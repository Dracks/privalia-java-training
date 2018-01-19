package com.privalia.collections;

import java.util.Map;

public class Category {
    private int idCategory;
    private String name;
    private Map<Long, Product> productList;

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Long, Product> getProductList() {
        return productList;
    }

    public void setProductList(Map<Long, Product> productList) {
        this.productList = productList;
    }
}
