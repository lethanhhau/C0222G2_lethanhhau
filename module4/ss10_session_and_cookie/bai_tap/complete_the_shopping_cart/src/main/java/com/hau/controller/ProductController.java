package com.hau.controller;

import com.hau.model.Cart;
import com.hau.model.Product;
import com.hau.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@SessionAttributes(value = "listProductcart")
public class ProductController {

    @Autowired
    private IProductService iProductService;

    @ModelAttribute("cart")
    public Cart setupCart() {
        return new Cart();
    }

    @ModelAttribute("listProductCart")
    public List<Product> listProductCart() {
        return new ArrayList<>();
    }

    @GetMapping("")
    public String home(Model model){
        List<Product> products = (List<Product>) this.iProductService.findAll();
        model.addAttribute("products", products);
        model.addAttribute("product", new Product());
        return "home";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("product") Product product) {
        this.iProductService.save(product);
        return "redirect:/";
    }

    @GetMapping("/shop")
    public ModelAndView showShop() {
        ModelAndView modelAndView = new ModelAndView("/shop");
        modelAndView.addObject("products", iProductService.findAll());
        return modelAndView;
    }

    @GetMapping("/add/{id}")
    public String addToCart(@PathVariable Integer id, @ModelAttribute Cart cart, @RequestParam("action") String action) {
        Optional<Product> productOptional = iProductService.findById(id);
        if (!productOptional.isPresent()) {
            return "/error.404";
        }
        if (action.equals("show")) {
            cart.addProduct(productOptional.get());
            return "redirect:/shopping-cart";
        }
        cart.addProduct(productOptional.get());
        return "redirect:/shop";
    }
    @GetMapping("/buy")
    public String buyProduct(@SessionAttribute("listProductCart") List<Product> listProductCart){
        listProductCart.clear();
        return "redirect:/show-cart";
    }
}
