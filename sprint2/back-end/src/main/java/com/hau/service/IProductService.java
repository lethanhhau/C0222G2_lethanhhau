package com.hau.service;

import com.hau.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductService {

    List<Product> getNewProducts();

    void save(Product product);

    Page<Product> findAll(Pageable pageable);

    Product findById(String id);
}
