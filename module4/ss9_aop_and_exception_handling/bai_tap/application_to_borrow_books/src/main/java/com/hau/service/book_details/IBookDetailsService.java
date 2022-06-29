package com.hau.service.book_details;

import com.hau.model.BookDetail;

import java.util.List;

public interface IBookDetailsService {

    void save(BookDetail bookDetail);

    List<BookDetail> findByIdBookDetail(Integer id);

}