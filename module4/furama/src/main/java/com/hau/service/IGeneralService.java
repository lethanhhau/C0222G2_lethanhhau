package com.hau.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IGeneralService<T> {
    Page<T> findAll(Pageable pageable, String searchValue);

    Optional<T> findById(Integer id);

    void save(T t);

    void remove(Integer id);


}
