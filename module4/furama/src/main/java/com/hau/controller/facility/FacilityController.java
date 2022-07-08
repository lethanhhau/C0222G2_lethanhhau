package com.hau.controller.facility;

import com.hau.dto.facility.FacilityDto;
import com.hau.model.facility.Facility;
import com.hau.model.facility.FacilityType;
import com.hau.model.facility.RentType;
import com.hau.service.facility.IFacilityService;
import com.hau.service.facility_type.IFacilityTypeService;
import com.hau.service.rent_type.IRentTypeService;
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
public class FacilityController {

    @Autowired
    private IFacilityService iFacilityService;

    @Autowired
    private IRentTypeService iRentTypeService;

    @Autowired
    private IFacilityTypeService iFacilityTypeService;

    @ModelAttribute("rentTypes")
    public List<RentType> rentTypes() {
        return this.iRentTypeService.findAllRentType();
    }

    @ModelAttribute("facilityTypes")
    public List<FacilityType> facilityTypes() {
        return this.iFacilityTypeService.findAllFacilityType();
    }

    @GetMapping("facility-list")
    public String goHomeFacility(@PageableDefault(value = 5) Pageable pageable, Model model,
                                 @RequestParam Optional<String> searchParam) {
        String searchValue = searchParam.orElse("");
        Page<Facility> facilities = this.iFacilityService.findAll(pageable, searchValue);
        model.addAttribute("searchValue", searchValue);
        model.addAttribute("facilities", facilities);
        return "facility/list";

    }

    @GetMapping("/facility/create")
    public String showCreate(Model model) {
        model.addAttribute("facilityDto", new FacilityDto());
        return "facility/create";
    }

    @PostMapping("/facility/create")
    public String createFacility(@Valid @ModelAttribute("facilityDto") FacilityDto facilityDto,
                                 BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        new FacilityDto().validate(facilityDto, bindingResult);
        if (bindingResult.hasErrors()) {
            return "facility/create";
        }else {
            Facility facility = new Facility();
            BeanUtils.copyProperties(facilityDto, facility);
            this.iFacilityService.save(facility);
            redirectAttributes.addFlashAttribute("success","Register success!");
            return "redirect:/facility-list";
        }
    }

    @GetMapping("/facility/edit/{id}")
    public String showEditFacility(@PathVariable int id, Model model) {
        Optional<Facility> facility = this.iFacilityService.findById(id);
        model.addAttribute("facility", facility);
        return "facility/edit";
    }

    @PostMapping("/facility/edit")
    public String editFacility(@ModelAttribute Facility facility, RedirectAttributes redirectAttributes) {
        this.iFacilityService.save(facility);
        redirectAttributes.addFlashAttribute("msgEdit", "successful fix!");
        return "redirect:/facility-list";
    }

    @GetMapping("/facility/delete/{id}")
    public String deleteFacility(@PathVariable int id, RedirectAttributes redirectAttributes) {
        this.iFacilityService.remove(id);
        redirectAttributes.addFlashAttribute("msgDelete","Successful deletion!");
        return "redirect:/facility-list";
    }

}
