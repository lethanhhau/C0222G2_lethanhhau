package com.hau.controller.employee;

import com.hau.dto.customer.CustomerTypeDto;
import com.hau.model.customer.CustomerType;
import com.hau.model.employee.Division;
import com.hau.service.customer_type.ICustomerTypeService;
import com.hau.service.division.IDivisionService;
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
import java.util.Optional;

@Controller
@RequestMapping("/division")
public class DivisionController {
//
//        @Autowired
//        private IDivisionService iDivisionService;
//
//
//        @GetMapping("/home")
//        public String goHomeDivision(@PageableDefault(value = 3) Pageable pageable, Model model,
//                                         @RequestParam Optional<String> searchParam){
//            String searchValue = searchParam.orElse("");
//            Iterable<Division> divisions = this.iDivisionService.findAll(pageable, searchValue);
//            model.addAttribute("searchValue", searchValue);
//            model.addAttribute("divisions", divisions);
//            return "division/list";
//        }
//
//        @GetMapping("/delete/{id}")
//        public String delete(@PathVariable int id) {
//            this.iDivisionService.remove(id);
//            return "redirect:/division/home";
//        }
//
//        @GetMapping("/create")
//        public String showCreate(Model model) {
//            model.addAttribute("customerTypeDto", new CustomerTypeDto());
//            return "division/create";
//        }
//
//        @PostMapping("/create")
//        public String create(@Valid @ModelAttribute("divisionDto")  DivisionDto divisionDto,
//                             BindingResult bindingResult,
//                             RedirectAttributes redirectAttributes,
//                             Model model) {
//            new DivisionDto().validate(divisionDto, bindingResult);
//            if (bindingResult.hasErrors()){
//                return "division/create";
//            }else {
//                CustomerType customerType = new CustomerType();
//                BeanUtils.copyProperties(divisionDto, division);
//                this.iDivisionService.save(division);
//                redirectAttributes.addFlashAttribute("success", "Register success!");
//                return "redirect:/customerType/list";
//            }
//        }
//
//        @GetMapping("/edit/{id}")
//        public String showEdit(@PathVariable int id, Model model) {
//            Optional<CustomerType> customerType = this.iCustomerTypeService.findById(id);
//            model.addAttribute("customerType", customerType);
//            return "customerType/edit";
//        }
//
//        @PostMapping("/edit")
//        public String edit(@ModelAttribute CustomerType customerType) {
//            this.iCustomerTypeService.save(customerType);
//            return "redirect:/customerType/list";
//        }

}
