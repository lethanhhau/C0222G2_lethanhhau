package com.hau.controller;

import com.hau.model.Book;
import com.hau.model.BookDetail;
import com.hau.service.book.IBookService;
import com.hau.service.book_details.IBookDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private IBookService iBookService;

    @Autowired
    private IBookDetailsService iBookDetailsService;

    @GetMapping("/home")
    public String goHome(Model model) {
        List<Book> books = this.iBookService.findAll();
        model.addAttribute("books", books);
        return "list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        this.iBookService.remove(id);
        return "redirect:/book/home";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("book", new Book());
        return "create";
    }

    @PostMapping("/create")
    public String create( @ModelAttribute("book") Book book,
                         RedirectAttributes redirectAttributes) {
            this.iBookService.save(book);
            redirectAttributes.addFlashAttribute("success", "Register success!");
            return "redirect:/book/home";
        }

    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable int id, Model model) {
        Book book = this.iBookService.getById(id);
        model.addAttribute("book", book);
        return "borrow";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute Book book) {
        this.iBookService.save(book);
        return "redirect:/book/home";
    }

    @GetMapping("/detail/{id}")
    public String showDetail(@PathVariable int id, Model model) {
        Book book = this.iBookService.getById(id);
        model.addAttribute("book", book);
        return "details";
    }

    @GetMapping("/borrow{id}")
    public String borrow(@PathVariable Integer id,RedirectAttributes redirectAttributes){
        List<BookDetail> bookDetails = iBookDetailsService.findByIdBookDetail(id);

        for (BookDetail bookDetail:bookDetails) {
            if (bookDetail.getStatusBook() == false){
                bookDetail.setStatusBook(true);
                iBookDetailsService.save(bookDetail);
                Book book=iBookService.getById(id);
                book.setBookAmount(book.getBookAmount()-1);
                iBookService.save(book);
                return "redirect:/book/home";
            }
        }
        redirectAttributes.addFlashAttribute("message","Not borrow");
        return "redirect:/book/home";
    }
}
