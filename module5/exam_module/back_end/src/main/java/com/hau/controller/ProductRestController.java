package com.hau.controller;

import com.hau.model.Product;
import com.hau.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/rest/product")
@RestController
@CrossOrigin

public class ProductRestController {

    @Autowired
    private IProductService iProductService;

    @GetMapping("/list")
    public ResponseEntity<List<Product>> getAllProduct(){
        List<Product> products = this.iProductService.findAllProduct();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}
