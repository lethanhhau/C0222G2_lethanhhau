package com.hau.service;

import com.hau.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IProductService {
    Page<Product> findAll(Pageable pageable, String searchValue);

    void remove(Integer id);

    void save(Product product);

    Product getById(Integer id);
}
