package com.hau.service.impl;

import com.hau.dto.IProductDTO;
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
    public List<Product> getPhone() {
        return iProductRepository.getPhone();
    }

    @Override
    public List<Product> getLaptop() {
        return iProductRepository.getLaptop();

    }

    @Override
    public List<Product> getTivi() {
        return iProductRepository.getTivi();
    }

    @Override
    public List<Product> getCamera() {
        return iProductRepository.getCamera();

    }

    @Override
    public List<Product> getDevice() {
        return iProductRepository.getDevice();

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
    public Page<Product> getAllProduct(Pageable pageable, String searchByName) {
        return iProductRepository.getAllProduct(pageable, "%"+ searchByName + "%");
    }
}