package com.hau.controller;

import com.hau.model.Email;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class EmailController {
    @GetMapping("/")
    public String showEmail(ModelMap modelMap) {
        modelMap.addAttribute("email", new Email());
        return "email";
    }

    @PostMapping("/addEmail")
    public String submitEmail(@ModelAttribute("email") Email email, ModelMap modelMap) {
        modelMap.addAttribute("addEmail", email);
        return "email";
    }
}
