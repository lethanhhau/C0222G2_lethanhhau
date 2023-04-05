package com.hau.service.impl;

import com.hau.model.Product;
import com.hau.repository.IProductRepository;
import com.hau.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {

    @Autowired
    private IProductRepository iProductRepository;


    @Override
    public Boolean deleteProduct(String id) {
        List<Product> productList = this.iProductRepository.findAll();
        for (Product product : productList) {
            if (product.getId().equals(Integer.parseInt(id)) && !product.getIsDeleted()) {
                this.iProductRepository.deleteProduct(id);
                return true;
            }
        }
        return false;
    }

    @Override
    public Product findById(Integer id) {
        return iProductRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Product product) {
        this.iProductRepository.save(product);
    }

    @Override
    public Page<Product> getPhone(Pageable pageable) {
        return iProductRepository.getPhone(pageable);
    }

    @Override
    public Page<Product> getLaptop(Pageable pageable) {
        return this.iProductRepository.getLaptop(pageable);

    }

    @Override
    public Page<Product> getTivi(Pageable pageable) {
        return this.iProductRepository.getTivi(pageable);
    }

    @Override
    public Page<Product> getCamera(Pageable pageable) {
        return this.iProductRepository.getCamera(pageable);
    }

    @Override
    public List<Product> getWashingMachine() {
        return this.iProductRepository.getWashingMachine();
    }

    @Override
    public List<Product> getFridge() {
        return this.iProductRepository.getFridge();
    }

    @Override
    public Page<Product> getDevice(Pageable pageable) {
        return this.iProductRepository.getDevice(pageable);

    }

    @Override
    public List<Product> getNewProducts() {
        return this.iProductRepository.getNewProducts();
    }

    @Override
    public List<Product> findAll() {
        return iProductRepository.findAll();
    }

    @Override
    public Page<Product> getAllProduct(Pageable pageable, String searchName) {
        return iProductRepository.getAllProduct(pageable, "%"+ searchName + "%");
    }
}