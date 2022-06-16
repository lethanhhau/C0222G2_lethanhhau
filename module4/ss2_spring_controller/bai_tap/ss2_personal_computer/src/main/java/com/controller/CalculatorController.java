package com.controller;

import com.service.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @Autowired
    private ICalculatorService iCalculatorService;

    @GetMapping("/")
    public String showCalculator() {
        return "index";
    }

    @GetMapping("/calculator")
    public String getCalculator(@RequestParam Integer number1, Integer number2, String operator, ModelMap modelMap) {
        Integer result = iCalculatorService.calculator(number1,number2,operator);
        modelMap.addAttribute("number1", number1);
        modelMap.addAttribute("number2", number2);
        modelMap.addAttribute("result", result);
        return "index";

    }
}
