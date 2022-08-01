package com.hau.controller.contract;

import com.hau.dto.contract.ContractDto;
import com.hau.model.contract.AttachFacility;
import com.hau.model.contract.Contract;
import com.hau.model.customer.Customer;
import com.hau.model.employee.Employee;
import com.hau.model.facility.Facility;
import com.hau.service.attach_facility.IAttachFacilityService;
import com.hau.service.contract.IContractService;
import com.hau.service.customer.ICustomerService;
import com.hau.service.employee.IEmployeeService;
import com.hau.service.facility.IFacilityService;
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
import java.util.List;


@Controller
public class ContractController {

    @Autowired
    private ICustomerService customerService;

    @Autowired
    private IFacilityService facilityService;

    @Autowired
    private IAttachFacilityService attachFacilityService;

    @Autowired
    private IEmployeeService employeeService;

    @Autowired
    private IContractService iContractService;

    @ModelAttribute("customerList")
    public List<Customer> getAllCustomer() {
        return this.customerService.findAll();
    }

    @ModelAttribute("facilityList")
    public List<Facility> getAllFacility() {
        return this.facilityService.findAll();
    }

    @ModelAttribute("attachFacilityList")
    public List<AttachFacility> getAllAttachFacility() {
        return this.attachFacilityService.findAll();
    }

    @ModelAttribute("employeeList")
    public List<Employee> getAllEmployee () {
        return this.employeeService.findAll();
    }

    @GetMapping("/contract-list")
    public String goHomeCustomer(@PageableDefault(value = 5) Pageable pageable, Model model){
        Page<Contract> contracts = this.iContractService.getAllContract(pageable);
        model.addAttribute("contracts", contracts);
        return "contract/list";
    }

    @GetMapping("/contract/delete/{id}")
    public String delete(@PathVariable int id, RedirectAttributes redirectAttributes) {
        this.iContractService.remove(id);
        redirectAttributes.addFlashAttribute("msgDelete","Successful deletion!");
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
}
