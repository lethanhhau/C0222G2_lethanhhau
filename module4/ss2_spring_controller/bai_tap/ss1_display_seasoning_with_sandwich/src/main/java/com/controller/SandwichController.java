package com.controller;

import com.service.ISandwichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {
    @Autowired
    private ISandwichService iSandwichService;

    @GetMapping("/")
    public String showCondiment() {
        return "index";
    }
@GetMapping("/save")
    public String save(@RequestParam("condiment") String[] condiment,ModelMap modelMap){
        modelMap.addAttribute("condiment",condiment);
        return "index";

}
}
