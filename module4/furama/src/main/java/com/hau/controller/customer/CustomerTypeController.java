package com.hau.controller.customer;

import com.hau.dto.customer.CustomerTypeDto;
import com.hau.model.customer.CustomerType;
import com.hau.service.customer_type.ICustomerTypeService;
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
public class CustomerTypeController {
    @Autowired
    private ICustomerTypeService iCustomerTypeService;


    @GetMapping("/customerType-list")
    public String goHomeCustomerType(@PageableDefault(value = 5) Pageable pageable, Model model,
                                 @RequestParam Optional<String> searchParam){
        String searchValue = searchParam.orElse("");
        Page<CustomerType> customerTypes = this.iCustomerTypeService.findAll(pageable, searchValue);
        model.addAttribute("searchValue", searchValue);
        model.addAttribute("customerTypes", customerTypes);
        return "customerType/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        this.iCustomerTypeService.remove(id);
        return "redirect:/division/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("divisionDto", new CustomerTypeDto());
        return "division/create";
    }

    @PostMapping("/create")
    public String create(@Valid @ModelAttribute("customerTypeDto")  CustomerTypeDto customerTypeDto,
                         BindingResult bindingResult,
                         RedirectAttributes redirectAttributes,
                         Model model) {
        new CustomerTypeDto().validate(customerTypeDto, bindingResult);
        if (bindingResult.hasErrors()){
            return "customerType/create";
        }else {
            CustomerType customerType = new CustomerType();
            BeanUtils.copyProperties(customerTypeDto, customerType);
            this.iCustomerTypeService.save(customerType);
            redirectAttributes.addFlashAttribute("success", "Register success!");
            return "redirect:/customerType/list";
        }
    }

    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable int id, Model model) {
        Optional<CustomerType> customerType = this.iCustomerTypeService.findById(id);
        model.addAttribute("customerType", customerType);
        return "customerType/edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute CustomerType customerType) {
        this.iCustomerTypeService.save(customerType);
        return "redirect:/customerType/list";
    }

}
