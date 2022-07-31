package com.hau.exam_module_5.controller;

import com.hau.exam_module_5.model.SanPham;
import com.hau.exam_module_5.service.ISanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
