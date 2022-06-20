package com.hau.controller;

import com.hau.model.MedicalDeclaration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MedicalDeclarationController {
    @GetMapping("/")
    public String show(ModelMap modelMap) {
        modelMap.addAttribute("medicalDeclarationForm", new MedicalDeclaration());
        return "medicalDeclarationForm";
    }

    @PostMapping("/medicalDeclaration")
    public String medicalDeclaration(@ModelAttribute("medicalDeclarationForm")MedicalDeclaration medicalDeclaration, ModelMap modelMap) {
        modelMap.addAttribute("medicalDeclaration", medicalDeclaration);
        return "medicalDeclarationForm";
    }

}
