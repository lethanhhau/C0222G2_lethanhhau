package com.hau.service;

import com.hau.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductService {

    Boolean deleteProduct(String id);

    Product findById(Integer id);

    void save(Product product);

    Page<Product> getPhone(Pageable pageable);

    Page<Product> getLaptop(Pageable pageable);

    Page<Product> getTivi(Pageable pageable);

    Page<Product> getCamera(Pageable pageable);

    List<Product> getWashingMachine();

    List<Product> getFridge();

    Page<Product> getDevice(Pageable pageable);

    List<Product> getNewProducts();

    List<Product> findAll();

    Page<Product> getAllProduct(Pageable pageable, String searchName);
}
