package com.controller;

import com.service.ICurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyConversionController {
    @Autowired
    private ICurrencyService iCurrencyService;

    @GetMapping("/currency")
    public String show(){
        return "currency";
    }

    @GetMapping(value = "/change")
    public String change(@RequestParam int usd , @RequestParam int rate , Model model){

        int vnd = this.iCurrencyService.change(usd, rate);
        model.addAttribute("vnd",vnd);
        return "currency";
    }
}
