package com.hau.repository.impl;

import com.hau.model.Customer;
import com.hau.repository.BaseRepository;
import com.hau.repository.ICustomerRepository;


import javax.persistence.Entity;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;


public class CustomerRepositoryImpl implements ICustomerRepository {
    @Override
    public List<Customer> findAll() {
        TypedQuery<Customer> typedQuery =
                BaseRepository.entityManager.createQuery(
                        "select s " +
                                " from Customer s", Customer.class);
        return typedQuery.getResultList();
    }

    @Override
    public void save(Customer customer) {
        EntityTransaction entityTransaction =
                BaseRepository.entityManager.getTransaction();

        entityTransaction.begin();

        BaseRepository.entityManager.persist(customer);

        entityTransaction.commit();
    }
}
