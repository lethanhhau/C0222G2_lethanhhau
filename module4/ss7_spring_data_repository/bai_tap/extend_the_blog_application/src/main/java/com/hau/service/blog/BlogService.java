package com.hau.service.blog;

import com.hau.model.Blog;
import com.hau.model.Category;
import com.hau.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;

    @Override
    public Iterable<Blog> findAll() {
        return this.iBlogRepository.findAll();
    }

    @Override
    public Optional<Blog> findById(Integer id) {
        return this.iBlogRepository.findById(id);
    }

    @Override
    public void save(Blog blog) {
        this.iBlogRepository.save(blog);
    }

    @Override
    public void remove(Integer id) {
        this.iBlogRepository.delete(this.iBlogRepository.getById(id));
    }

    @Override
    public Iterable<Blog> findAllByCategory(Category category) {
        return iBlogRepository.findAllByCategory(category);
    }

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return this.iBlogRepository.findAll(pageable);
    }

    @Override
    public Page<Blog> findAllByTitleContaining(String title, Pageable pageable) {
        return this.iBlogRepository.findAllByTitleContaining(title,pageable);
    }
}
