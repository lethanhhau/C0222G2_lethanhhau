package com.hau.service.category;

import com.hau.model.Blog;
import com.hau.model.Category;
import com.hau.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICategoryService extends IGeneralService<Category> {
    Page<Category> findAll(Pageable pageable);
}
