package com.hau.service;

import com.hau.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductService {

    Boolean deleteProduct(String id);

    Product findById(Integer id);

    void save(Product product);

    List<Product> getPhone();

    List<Product> getLaptop();

    List<Product> getTivi();

    List<Product> getCamera();

    List<Product> getDevice();

    List<Product> getNewProducts();

    List<Product> findAll();

    Page<Product> getAllProduct(Pageable pageable, String searchByName);
}
