package com.hau.service.book;

import com.hau.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> findAll();

    void remove(Integer id);

    void save(Book book);

    Book getById(Integer id);

    Book findAllBookMax();
}
