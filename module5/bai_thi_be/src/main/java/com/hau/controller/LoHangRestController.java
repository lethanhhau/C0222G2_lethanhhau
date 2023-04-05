package com.hau.controller;

import com.hau.model.LoHang;
import com.hau.service.ILoHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/rest/loHang")
@RestController
@CrossOrigin
public class LoHangRestController {
    @Autowired
    private ILoHangService iLoHangService;


    @GetMapping("/page")
    public ResponseEntity<Page<LoHang>> getAllConsignment(@PageableDefault(3) Pageable pageable,
                                                          @RequestParam Optional<String> keyWord) {
        String searchName = keyWord.orElse("");
        Page<LoHang> loHangList= this.iLoHangService.findAll(pageable,searchName);
        if (loHangList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(loHangList, HttpStatus.OK);
        }
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<LoHang> findByName(@PathVariable Integer id) {
        LoHang consignment = this.iLoHangService.findById(id);
        return new ResponseEntity<>(consignment, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Void> createConsignment(@RequestBody LoHang loHang) {
        this.iLoHangService.save(loHang);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{idDelete}")
    public ResponseEntity<Void> deleteConsignment(@PathVariable Integer idDelete) {
        this.iLoHangService.delete(idDelete);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PatchMapping("/update")
    public ResponseEntity<Void> updateConsignment(@RequestBody LoHang loHang) {
        this.iLoHangService.save(loHang);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}

