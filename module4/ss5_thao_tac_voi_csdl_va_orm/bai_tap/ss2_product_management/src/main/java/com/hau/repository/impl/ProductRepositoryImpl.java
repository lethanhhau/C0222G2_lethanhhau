package com.hau.repository.impl;

import com.hau.model.Product;
import com.hau.repository.BaseRepository;
import com.hau.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements IProductRepository {
    @Override
    public List<Product> findAll() {
        TypedQuery<Product> typedQuery =
                BaseRepository.entityManager.createQuery(
                        "select s " +
                                " from Product s", Product.class);
        return typedQuery.getResultList();
    }
}
