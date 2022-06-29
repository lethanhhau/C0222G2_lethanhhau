package com.hau.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Integer bookId;
    @Column(name = "book_name")
    private String bookName;
    @Column(name = "book_amount")
    private Integer bookAmount;
    @Column(name = "book_author")
    private String bookAuthor;
    @Column(name = "book_year")
    private String bookYear;

    @OneToMany(mappedBy = "book")
    @Column(name = "book_details_list")
    private List<BookDetail> bookDetailList;

    public Book() {
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getBookAmount() {
        return bookAmount;
    }

    public void setBookAmount(Integer bookAmount) {
        this.bookAmount = bookAmount;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookYear() {
        return bookYear;
    }

    public void setBookYear(String bookYear) {
        this.bookYear = bookYear;
    }

    public List<BookDetail> getBookDetailsList() {
        return bookDetailList;
    }

    public void setBookDetailsList(List<BookDetail> bookDetailList) {
        this.bookDetailList = bookDetailList;
    }
}
