package com.hau.service.impl;

import com.hau.model.Product;
import com.hau.repository.IProductRepository;
import com.hau.repository.impl.ProductRepositoryImpl;
import com.hau.service.IProductService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements IProductService {
private IProductRepository iProductRepository = new ProductRepositoryImpl();

    @Override
    public List<Product> findAll() {
        return iProductRepository.findAll();
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void remove(int id) {

    }

    @Override
    public List<Product> findByName(String name) {
        return null;
    }
}
