package com.hau.controller.contract;

import com.hau.dto.contract.ContractDto;
import com.hau.dto.customer.CustomerDto;
import com.hau.model.contract.AttachFacility;
import com.hau.model.contract.Contract;
import com.hau.model.contract.ContractDetail;
import com.hau.model.customer.Customer;
import com.hau.model.facility.Facility;
import com.hau.service.attach_facility.IAttachFacilityService;
import com.hau.service.contract.IContractService;
import com.hau.service.contract_detail.IContractDetailService;
import com.hau.service.customer.ICustomerService;
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
import java.util.Optional;


@Controller
public class ContractController {

    @Autowired
    private IContractService iContractService;

    @Autowired
    private ICustomerService iCustomerService;

    @Autowired
    private IFacilityService iFacilityService;

    @Autowired
    private IAttachFacilityService iAttachFacilityService;

    @Autowired
    private IContractDetailService iContractDetailService;

    @ModelAttribute("contractDetails")
    public List<ContractDetail> getAllContractDetail() {
        return this.iContractDetailService.findAll();
    }

    @ModelAttribute("attachFacilityList")
    public List<AttachFacility> getAllAttachFacility() {
        return this.iAttachFacilityService.findAll();
    }

    @ModelAttribute("customers")
    public List<Customer> getAllCustomer() {
        return this.iCustomerService.findAllCustomer();
    }

    @ModelAttribute("facilities")
    public List<Facility> getAllFacility() {
        return  this.iFacilityService.findAllFacility();
    }

    @GetMapping("/contract-list")
    public String goHomeContract(@PageableDefault(value = 5) Pageable pageable, Model model){
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
