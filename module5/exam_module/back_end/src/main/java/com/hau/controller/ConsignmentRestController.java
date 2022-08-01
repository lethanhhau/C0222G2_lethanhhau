package com.hau.controller;

import com.hau.model.Consignment;
import com.hau.service.IConsignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/rest/consignment")
@RestController
@CrossOrigin
public class ConsignmentRestController {

    @Autowired
    private IConsignmentService iConsignmentService;

    @GetMapping("")
    public ResponseEntity<Page<Consignment>> getAllConsignment(@PageableDefault(3) Pageable pageable,
                                                               @RequestParam Optional<String> keyWord) {
        String searchProductName = keyWord.orElse("");
        Page<Consignment> consignments = this.iConsignmentService.findAllConsignment(pageable, searchProductName);
        if (consignments.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(consignments, HttpStatus.OK);
        }
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Consignment> findById(@PathVariable Integer id) {
        Consignment consignment = this.iConsignmentService.findById(id);
        return new ResponseEntity<>(consignment, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Void> createConsignment(@RequestBody Consignment consignment) {
        this.iConsignmentService.saveConsignment(consignment);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{idDelete}")
    public ResponseEntity<Void> deleteConsignment(@PathVariable Integer idDelete){
        this.iConsignmentService.deleteConsignment(idDelete);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PatchMapping("update")
    public ResponseEntity<Void> updateConsignment(@RequestBody Consignment consignment){
        this.iConsignmentService.saveConsignment(consignment);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
