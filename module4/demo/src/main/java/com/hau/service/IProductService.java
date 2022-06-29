package com.hau.service;

import com.hau.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void save(Product product);

    Product getById(int id);
}
