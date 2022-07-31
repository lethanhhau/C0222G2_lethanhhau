package com.hau.exam_module_5.controller;

import com.hau.exam_module_5.dto.ConsignmentDto;
import com.hau.exam_module_5.model.Consignment;
import com.hau.exam_module_5.model.Product;
import com.hau.exam_module_5.service.IConsignmentService;
import com.hau.exam_module_5.service.IProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/rest/consignment")
public class ConsignmentRestController {

    @Autowired
    private IConsignmentService iConsignmentService;


    @GetMapping("")
    public ResponseEntity<List<Consignment>> getAllConsignment() {
        List<Consignment> consignments= this.iConsignmentService.findAll();
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

    @DeleteMapping("/delete/{idDelete}")
    public ResponseEntity<Void> deleteConsignment(@PathVariable Integer idDelete) {
        this.iConsignmentService.delete(idDelete);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Void> createConsignment(@RequestBody Consignment consignment) {
        this.iConsignmentService.save(consignment);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PatchMapping("/edit")
    public ResponseEntity<Void> updateConsignment(@RequestBody Consignment consignment) {
        this.iConsignmentService.save(consignment);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
