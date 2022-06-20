package com.hau.service;

import com.hau.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService{
    private static final Map<Integer, Product> products = new HashMap<>();

    static {
        products.put(1,new Product(1,"ip11",10000000d,"màu trắng","apple"));
        products.put(2,new Product(2,"ip11Pro",15000000d,"màu đỏ","apple"));
        products.put(3,new Product(3,"ip12",20000000d,"màu vàng","apple"));
        products.put(4,new Product(4,"ip12Pro",25000000d,"màu xanh","apple"));
        products.put(5,new Product(5,"ip13",30000000d,"màu vàng","apple"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> productList = new ArrayList<>();
        for(Product product : products.values()){
            if(product.getName().contains(name)){
                productList.add(product);
            }
        }
        return productList;
    }
}
