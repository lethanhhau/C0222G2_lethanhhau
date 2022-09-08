package com.hau.service.impl;

import com.hau.model.Category;
import com.hau.repository.ICategoryRepository;
import com.hau.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {

    @Autowired
    private ICategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        return this.categoryRepository.getAllCategory();
    }
}
