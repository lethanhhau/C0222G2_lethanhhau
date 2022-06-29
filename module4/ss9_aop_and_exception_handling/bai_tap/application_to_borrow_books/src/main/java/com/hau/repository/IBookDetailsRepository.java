package com.hau.repository;

import com.hau.model.BookDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IBookDetailsRepository extends JpaRepository<BookDetail, Integer> {

    @Query(value = "select * from book_detail where book_id = :keyword and status_book = false", nativeQuery = true)
    List<BookDetail> findByIdBookDetail(@Param("keyword")Integer id);
}
