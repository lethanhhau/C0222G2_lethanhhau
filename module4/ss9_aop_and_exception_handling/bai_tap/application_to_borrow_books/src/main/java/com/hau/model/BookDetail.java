package com.hau.model;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;

@Entity
public class BookDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_details_id")
    private Integer bookDetailsId;
    @Column(name = "book_details_name")
    private String bookDetailsName;
    @Value("false")
    private Boolean statusBook;
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    public BookDetail() {
    }

    public BookDetail(Integer bookDetailsId, String bookDetailsName, Boolean statusBook, Book book) {
        this.bookDetailsId = bookDetailsId;
        this.bookDetailsName = bookDetailsName;
        this.book = book;
    }

    public Integer getBookDetailsId() {
        return bookDetailsId;
    }

    public void setBookDetailsId(Integer bookDetailsId) {
        this.bookDetailsId = bookDetailsId;
    }

    public String getBookDetailsName() {
        return bookDetailsName;
    }

    public void setBookDetailsName(String bookDetailsName) {
        this.bookDetailsName = bookDetailsName;
    }

    public Boolean getStatusBook() {
        return statusBook;
    }

    public void setStatusBook(Boolean statusBook) {
        this.statusBook = statusBook;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }


}
