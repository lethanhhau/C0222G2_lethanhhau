package com.hau.service;

import com.hau.model.Product;
import com.hau.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService implements IProductService{

    @Autowired
    private IProductRepository iProductRepository;

    @Override
    public Page<Product> findAll(Pageable pageable, String searchValue) {
        return this.iProductRepository.findByNameProduct(pageable, "%" + searchValue + "%");
    }

    @Override
    public void remove(Integer id) {
        this.iProductRepository.delete(this.iProductRepository.getById(id));
    }

    @Override
    public void save(Product product) {
        this.iProductRepository.save(product);
    }

    @Override
    public Product getById(Integer id) {
        return this.iProductRepository.getById(id);
    }

    @Override
    public Optional<Product> findById(Integer id) {
        return this.iProductRepository.findById(id);
    }

    @Override
    public Object findAll() {
        return this.iProductRepository.findAll();
    }
}
