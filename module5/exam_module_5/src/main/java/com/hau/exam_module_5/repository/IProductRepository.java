package com.hau.exam_module_5.repository;

import com.hau.exam_module_5.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Integer> {
}
