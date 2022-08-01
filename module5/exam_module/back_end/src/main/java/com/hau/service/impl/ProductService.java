package com.hau.service.impl;

import com.hau.model.Product;
import com.hau.repository.IProductRepository;
import com.hau.service.IProductService;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import java.util.List;

@Service
public class ProductService implements IProductService {

    private IProductRepository iProductRepository;

    @Override
    public List<Product> findAllProduct() {
        return this.iProductRepository.findAll();
    }
}
