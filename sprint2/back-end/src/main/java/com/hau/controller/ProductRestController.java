package com.hau.controller;

import com.hau.dto.ErrorDTO;
import com.hau.dto.ProductDTO;
import com.hau.model.Category;
import com.hau.model.Product;
import com.hau.service.ICategoryService;
import com.hau.service.IProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/rest")
public class ProductRestController {

    @Autowired
    private IProductService iProductService;

    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping( "/product/list")
    public ResponseEntity<List<Product>> getAllListProducts() {
        List<Product> productList = this.iProductService.findAll();
        if (productList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }

    @GetMapping(value = "/new/products")
    public ResponseEntity<List<Product>> getNewProducts() {
        List<Product> productList = this.iProductService.getNewProducts();
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }

    @GetMapping("/products")
    public ResponseEntity<Page<Product>> getPageProduct(@PageableDefault(30)Pageable pageable,
                                                        @RequestParam("searchName") Optional<String> search){
        String searchName = search.orElse("");
        Page<Product> productDTOPage = iProductService.getAllProduct(pageable,searchName);
        if(productDTOPage.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(productDTOPage,HttpStatus.OK);
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Product> findById(@PathVariable Integer id){

        if(id == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(iProductService.findById(id),HttpStatus.OK);
    }

//    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @PostMapping("/product/create")
    public ResponseEntity<?> createProduct(@Valid @RequestBody ProductDTO productDTO , BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Product product = new Product();
        BeanUtils.copyProperties(productDTO,product);
        iProductService.save(product);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

//    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @PatchMapping("/product/edit")
    public ResponseEntity<?> editProduct(@Valid @RequestBody ProductDTO productDTO , BindingResult bindingResult){
        Product product  = iProductService.findById(productDTO.getId());
        if(bindingResult.hasErrors()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        BeanUtils.copyProperties(productDTO,product);
        iProductService.save(product);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    //    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable String id) {
        Boolean check = this.iProductService.deleteProduct(id);
        if (check) {
            return new ResponseEntity<>(HttpStatus.OK);
        }
        ErrorDTO errorDto = new ErrorDTO();
        errorDto.setMessage("idnotfound");
        return new ResponseEntity<>(errorDto, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/category")
    public ResponseEntity<List<Category>> getAllCategory() {
        List<Category> categoryList = iCategoryService.getAllCategory();
        if (categoryList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(categoryList, HttpStatus.OK);
    }

    @GetMapping("/phone")
    public ResponseEntity<Page<Product>> getSmartPhone(@PageableDefault(18)Pageable pageable){
        Page<Product> productList = this.iProductService.getPhone(pageable);
        if (productList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }

    @GetMapping("/laptop")
    public ResponseEntity<Page<Product>> getLaptop(@PageableDefault(18)Pageable pageable){
        Page<Product> productList = iProductService.getLaptop(pageable);
        if (productList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }

    @GetMapping("/tivi")
    public ResponseEntity<Page<Product>> getTivi(@PageableDefault(18)Pageable pageable){
        Page<Product> productList = iProductService.getTivi(pageable);
        if (productList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }

    @GetMapping("/camera")
    public ResponseEntity<Page<Product>> getCamera(@PageableDefault(18)Pageable pageable){
        Page<Product> productList = this.iProductService.getCamera(pageable);
        if (productList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }

    @GetMapping("/washingMachine")
    public ResponseEntity<List<Product>> getWashingMachine(){
        List<Product> productList = this.iProductService.getWashingMachine();
        if (productList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }

    @GetMapping("/fridge")
    public ResponseEntity<List<Product>> getFridge(){
        List<Product> productList = this.iProductService.getFridge();
        if (productList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }

    @GetMapping("/device-sup")
    public ResponseEntity<Page<Product>> getDevice(@PageableDefault(18)Pageable pageable){
        Page<Product> productList = this.iProductService.getDevice(pageable);
        if (productList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }

}

