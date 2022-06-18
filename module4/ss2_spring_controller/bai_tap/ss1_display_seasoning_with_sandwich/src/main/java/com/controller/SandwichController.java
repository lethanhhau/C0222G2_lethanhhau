package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
public class SandwichController {

    @GetMapping("/")
    public String showCondiment() {
        return "index";
    }

    @GetMapping("/save")
    public String save(@RequestParam("condiment") String[] condiment, ModelMap modelMap) {
        modelMap.addAttribute("condiment", Arrays.toString(condiment));
        return "index";

    }
}
