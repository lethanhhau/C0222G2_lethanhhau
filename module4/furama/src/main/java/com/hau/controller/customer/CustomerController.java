package com.hau.controller.customer;

import com.hau.dto.customer.CustomerDto;
import com.hau.model.customer.Customer;
import com.hau.model.customer.CustomerType;
import com.hau.service.customer.ICustomerService;
import com.hau.service.customer_type.ICustomerTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class CustomerController {

    @Autowired
    private ICustomerService iCustomerService;

    @Autowired
    private ICustomerTypeService iCustomerTypeService;


    @ModelAttribute("customerTypes")
    public List<CustomerType> customerTypes(){
        return this.iCustomerTypeService.findAllCustomerType();
    }

   @GetMapping("/customer-list")
    public String goHomeCustomer(@PageableDefault(value = 3) Pageable pageable, Model model,
                                 @RequestParam Optional<String> searchParam){
        String searchValue = searchParam.orElse("");
        Iterable<Customer> customers = this.iCustomerService.findAll(pageable, searchValue);
        model.addAttribute("searchValue", searchValue);
        model.addAttribute("customers", customers);
        return "customer/list";
    }

    @GetMapping("/customer/delete/{id}")
    public String delete(@PathVariable int id) {
        this.iCustomerService.remove(id);
        return "redirect:/customer-list";
    }

    @GetMapping("/customer/create")
    public String showCreate(Model model) {
        model.addAttribute("customerDto", new CustomerDto());
        return "customer/create";
    }


    @PostMapping("/customer/create")
    public String create(@Valid @ModelAttribute("customerDto")  CustomerDto customerDto,
                         BindingResult bindingResult,
                         RedirectAttributes redirectAttributes) {
        new CustomerDto().validate(customerDto, bindingResult);
        if (bindingResult.hasErrors()){

            return "customer/create";
        }else {
            Customer customer = new Customer();
            BeanUtils.copyProperties(customerDto, customer);
            this.iCustomerService.save(customer);
            redirectAttributes.addFlashAttribute("success", "Register success!");
            return "redirect:/customer-list";
        }
    }

    @GetMapping("/customer/edit/{id}")
    public String showEdit(@PathVariable int id, Model model) {
        Optional<Customer> customer = this.iCustomerService.findById(id);
        model.addAttribute("customer", customer);
        return "customer/edit";
    }

    @PostMapping("/customer/edit")
    public String edit(@ModelAttribute Customer customer) {
        this.iCustomerService.save(customer);
        return "redirect:/customer-list";
    }
}
