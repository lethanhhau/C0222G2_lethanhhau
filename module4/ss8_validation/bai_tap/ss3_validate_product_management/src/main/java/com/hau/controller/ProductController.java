package com.hau.controller;

import com.hau.dto.ProductDto;
import com.hau.model.Product;
import com.hau.service.IProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @GetMapping("/home")
    public String goHome
            (@PageableDefault(value = 5) Pageable pageable,
             Model model,
             @RequestParam Optional<String> searchParam) {
        String searchValue = searchParam.orElse("");
        Page<Product> products = this.iProductService.findAll(pageable, searchValue);
        model.addAttribute("searchValue", searchValue);
        model.addAttribute("products", products);
        return "list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        this.iProductService.remove(id);
        return "redirect:/product/home";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("productDto", new ProductDto());
        return "create";
    }

    @PostMapping("/create")
    public String create(@Valid @ModelAttribute("productDto")  ProductDto productDto,
                         BindingResult bindingResult,
                         RedirectAttributes redirectAttributes,
                         Model model) {
        new ProductDto().validate(productDto, bindingResult);
        if (bindingResult.hasErrors()){
            return "create";
        }else {
            Product product = new Product();
            BeanUtils.copyProperties(productDto, product);
            this.iProductService.save(product);
            redirectAttributes.addFlashAttribute("success", "Register success!");
            return "redirect:/product/home";
        }
    }

    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable int id, Model model) {
        Product product = this.iProductService.getById(id);
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(product, productDto);
        model.addAttribute("product", productDto);
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@Valid @ModelAttribute("product") ProductDto productDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "edit";
        } else {
            Product product = new Product();
            BeanUtils.copyProperties(productDto, product);
            this.iProductService.save(product);
            return "redirect:/product/home";
        }
    }
    @GetMapping("/detail/{id}")
    public String showDetail(@Valid @PathVariable int id, Model model) {
        Product product = this.iProductService.getById(id);
        model.addAttribute("product", product);
        return "details";
    }



}
