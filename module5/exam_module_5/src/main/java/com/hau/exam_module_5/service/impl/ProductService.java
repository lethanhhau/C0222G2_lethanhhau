package com.hau.exam_module_5.service.impl;

import com.hau.exam_module_5.model.Product;
import com.hau.exam_module_5.repository.IProductRepository;
import com.hau.exam_module_5.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;

    @Override
    public List<Product> findAll() {
        return this.iProductRepository.findAll();
    }
}
