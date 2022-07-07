package com.hau.controller.contract;


import com.hau.dto.contract.ContractDto;
import com.hau.dto.customer.CustomerDto;
import com.hau.model.contract.Contract;
import com.hau.model.customer.Customer;
import com.hau.model.customer.CustomerType;
import com.hau.model.employee.Employee;
import com.hau.model.facility.Facility;
import com.hau.service.contract.IContractService;
import com.hau.service.customer.ICustomerService;
import com.hau.service.employee.IEmployeeService;
import com.hau.service.facility.IFacilityService;
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
public class ContractController {

    @Autowired
    private IContractService iContractService;

    @Autowired
    private IFacilityService iFacilityService;

    @Autowired
    private IEmployeeService iEmployeeService;

    @Autowired
    private ICustomerService iCustomerService;

    @ModelAttribute("facilitis")
    public List<Facility> facilities(){
        return this.iFacilityService.findAllFacility();
    }

    @ModelAttribute("employees")
    public List<Employee> employees(){
        return this.iEmployeeService.findAllEmployee();
    }

    @ModelAttribute("customers")
    public List<Customer> customers(){
        return this.iCustomerService.findAllCustomer();
    }

    @GetMapping("/contract-list")
    public String goHomeContract(@PageableDefault(value = 3) Pageable pageable, Model model,
                                 @RequestParam Optional<String> searchParam){
        String searchValue = searchParam.orElse("");
        Iterable<Contract> contracts = this.iContractService.findAll(pageable, searchValue);
        model.addAttribute("searchValue", searchValue);
        model.addAttribute("contracts", contracts);
        return "contract/list";
    }

    @GetMapping("/contract/delete/{id}")
    public String delete(@PathVariable int id) {
        this.iContractService.remove(id);
        return "redirect:/contract-list";
    }

    @GetMapping("/contract/create")
    public String showCreate(Model model) {
        model.addAttribute("contractDto", new ContractDto());
        return "contract/create";
    }


    @PostMapping("/contract/create")
    public String create(@Valid @ModelAttribute("contractDto")  ContractDto contractDto,
                         BindingResult bindingResult,
                         RedirectAttributes redirectAttributes) {
        new ContractDto().validate(contractDto, bindingResult);
        if (bindingResult.hasErrors()){

            return "contract/create";
        }else {
            Contract contract = new Contract();
            BeanUtils.copyProperties(contractDto, contract);
            this.iContractService.save(contract);
            redirectAttributes.addFlashAttribute("success", "Register success!");
            return "redirect:/contract-list";
        }
    }

    @GetMapping("/contract/edit/{id}")
    public String showEdit(@PathVariable int id, Model model) {
        Optional<Contract> contract = this.iContractService.findById(id);
        model.addAttribute("contract", contract);
        return "contract/edit";
    }

    @PostMapping("/contract/edit")
    public String edit(@ModelAttribute Contract contract) {
        this.iContractService.save(contract);
        return "redirect:/contract-list";
    }
}
