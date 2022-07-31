package com.hau.exam_module_5.controller;

import com.hau.exam_module_5.model.Product;
import com.hau.exam_module_5.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/rest/product")
public class ProductRestController {
    @Autowired
    private IProductService iProductService;

    @GetMapping("/list")
    public ResponseEntity<List<Product>> getAllProduct() {
        List<Product> productList = this.iProductService.findAll();
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }
}
