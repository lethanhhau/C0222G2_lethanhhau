package com.hau.service.blog;

import com.hau.model.Blog;
import com.hau.model.Category;
import com.hau.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBlogService extends IGeneralService<Blog> {
    Page<Blog> findAll(Pageable pageable);
    Iterable<Blog> findAllByCategory(Category category);
    Blog save(Blog blog);

    Page<Blog> getAllBlog(String searchValue, Pageable pageable);
}
