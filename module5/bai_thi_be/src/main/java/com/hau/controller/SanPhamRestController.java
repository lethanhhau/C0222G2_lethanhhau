package com.hau.controller;


import com.hau.model.SanPham;
import com.hau.service.ISanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/rest/sanPham")
@RestController
@CrossOrigin
public class SanPhamRestController {

    @Autowired
    private ISanPhamService iSanPhamService;

    @GetMapping("")
    public ResponseEntity<List<SanPham>> getAllProduct() {
        List<SanPham> productList = this.iSanPhamService.findAll();
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }
}