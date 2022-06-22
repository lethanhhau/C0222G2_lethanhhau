package com.hau.service;

import com.hau.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();

    void save(Blog blog);

    Blog getBlog(int id);

    void remove(int id);
}
