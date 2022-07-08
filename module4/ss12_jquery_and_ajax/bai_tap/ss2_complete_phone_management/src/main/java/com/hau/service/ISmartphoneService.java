package com.hau.service;

import com.hau.model.Smartphone;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ISmartphoneService {
    Iterable<Smartphone> findAll();

    Optional<Smartphone> findById(Integer id);

    Smartphone save(Smartphone smartPhone);

    void remove(Integer id);

    Page<Smartphone> getAllSmartphone(String searchParam, Pageable pageable);
}
