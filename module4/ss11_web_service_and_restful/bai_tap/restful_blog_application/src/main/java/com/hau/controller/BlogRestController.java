package com.hau.controller;

import com.hau.model.Blog;
import com.hau.model.Category;
import com.hau.service.blog.IBlogService;
import com.hau.service.category.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping(value = "/BlogRest")
@RestController
public class BlogRestController {

    @Autowired
    private IBlogService iBlogService;

    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping(value = "/blog-list")
    public ResponseEntity<Page<Blog>> getPageBlog(
            @PageableDefault(value = 5) Pageable pageable) {
        Page<Blog> blogs = this.iBlogService.findAll(pageable);

        if (!blogs.hasContent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }

    @GetMapping(value = "/categories-list")
    public ResponseEntity<Page<Category>> getPageCategory(
            @PageableDefault(value = 5) Pageable pageable) {
        Page<Category> categories = this.iCategoryService.findAll(pageable);

        if (!categories.hasContent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @GetMapping(value = "/blog/{id}")
    public ResponseEntity<Blog> findBlogById(@PathVariable Integer id) {
        Optional<Blog> blogOptional = this.iBlogService.findById(id);
        if (!blogOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blogOptional.get(), HttpStatus.OK);
    }

    @GetMapping(value = "/category/{id}")
    public ResponseEntity<Category> findCategoryById(@PathVariable Integer id) {
        Optional<Category> categoryOptional = this.iCategoryService.findById(id);
        if (!categoryOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(categoryOptional.get(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Blog> saveBlog(@RequestBody Blog blog) {
        return new ResponseEntity<>(this.iBlogService.save(blog), HttpStatus.CREATED);
    }

    @PutMapping("/blog/{id}")
    public ResponseEntity<Blog> updateBlog(@PathVariable Integer id, @RequestBody Blog blog) {
        Optional<Blog> blogOptional = this.iBlogService.findById(id);
        if (!blogOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        blog.setId(blogOptional.get().getId());
        return new ResponseEntity<>(iBlogService.save(blog), HttpStatus.OK);
    }


}
