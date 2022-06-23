package com.hau.service.impl;

import com.hau.model.Blog;
import com.hau.repository.IBlogRepository;
import com.hau.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {

    @Autowired
    private IBlogRepository iBlogRepository;


    @Override
    public List<Blog> findAll() {
        return this.iBlogRepository.getAllBlog();
    }

    @Override
    public void save(Blog blog) {
        this.iBlogRepository.save(blog);
    }

    @Override
    public Blog getBlog(int id) {
        return this.iBlogRepository.getBlog(id);
    }

    @Override
    public void remove(int id) {
        this.iBlogRepository.delete(id);
    }
}
