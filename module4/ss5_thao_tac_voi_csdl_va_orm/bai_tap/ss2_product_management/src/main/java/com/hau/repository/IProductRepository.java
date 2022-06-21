package com.hau.repository;

import com.hau.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();
}
