package com.hau.repository;

import com.hau.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Integer> {
}
