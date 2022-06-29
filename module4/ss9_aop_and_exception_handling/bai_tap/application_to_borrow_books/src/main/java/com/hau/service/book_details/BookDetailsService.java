package com.hau.service.book_details;

import com.hau.model.BookDetail;
import com.hau.repository.IBookDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookDetailsService implements IBookDetailsService{

    @Autowired
    private IBookDetailsRepository iBookDetailsRepository;

    @Override
    public void save(BookDetail bookDetail) {
        this.iBookDetailsRepository.save(bookDetail);
    }

    @Override
    public List<BookDetail> findByIdBookDetail(Integer id) {
        return this.iBookDetailsRepository.findByIdBookDetail(id);
    }
}
