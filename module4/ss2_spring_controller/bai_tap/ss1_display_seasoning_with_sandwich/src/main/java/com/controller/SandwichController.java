package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {

    @GetMapping("/")
    public String showCondiment() {
        return "index";
    }

    @GetMapping("/save")
    public String save(@RequestParam("condiment") String[] condiments, ModelMap modelMap) {
        modelMap.addAttribute("condiment", condiments);
        return "index";

    }
}
