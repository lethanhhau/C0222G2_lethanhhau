package com.hau.service.book;

import com.hau.model.Book;
import com.hau.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService{

    @Autowired
    private IBookRepository iBookRepository;

    @Override
    public List<Book> findAll() {
        return this.iBookRepository.findAll();
    }

    @Override
    public void remove(Integer id) {
        this.iBookRepository.delete(this.iBookRepository.getById(id));
    }

    @Override
    public void save(Book book) {
        this.iBookRepository.save(book);
    }

    @Override
    public Book getById(Integer id) {
        return null;
    }

    @Override
    public void borrowBook(Integer id) {

    }

    @Override
    public void setAmount(Integer id) {

    }
}
