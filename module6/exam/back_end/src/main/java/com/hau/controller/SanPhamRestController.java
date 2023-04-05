package com.hau.controller;

import com.hau.model.SanPham;
import com.hau.service.ISanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/rest")
@RestController
@CrossOrigin
public class SanPhamRestController {

    @Autowired
    private ISanPhamService iSanPhamService;

    @GetMapping("/sanPham")
    public ResponseEntity<Page<SanPham>>getAllSanPham(@PageableDefault(3) Pageable pageable,
                                                      @RequestParam Optional<String> keyWord) {
        String searchName = keyWord.orElse("");
        Page<SanPham> sanPhams = this.iSanPhamService.getAllSanPham(pageable, searchName);
        if (sanPhams.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(sanPhams, HttpStatus.OK);
        }
    }

    @GetMapping("/sanPham/detail/{id}")
    public ResponseEntity<SanPham> getById(@PathVariable Integer id) {
        SanPham sanPham = this.iSanPhamService.findById(id);
        if (sanPham == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(sanPham, HttpStatus.OK);
    }

    @DeleteMapping("/sanPham/delete/{idDelete}")
    public ResponseEntity<Void> deleteSanPham(@PathVariable Integer idDelete) {
        this.iSanPhamService.remove(idDelete);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/sanPham/create")
    public ResponseEntity<Void> createSanPham(@RequestBody SanPham sanPham) {
        this.iSanPhamService.save(sanPham);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
