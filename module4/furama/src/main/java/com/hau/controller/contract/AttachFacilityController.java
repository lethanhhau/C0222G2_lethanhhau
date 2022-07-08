package com.hau.controller.contract;

import com.hau.model.contract.AttachFacility;
import com.hau.service.attach_facility.IAttachFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AttachFacilityController {
    @Autowired
    private IAttachFacilityService iAttachFacilityService;

    @GetMapping("/attach/facility")
    public String showAttachFacility(Model model){
        List<AttachFacility> attachFacilities = this.iAttachFacilityService.findAll();
        model.addAttribute("attachFacilities", attachFacilities);
        return "contract/list";
    }
}
