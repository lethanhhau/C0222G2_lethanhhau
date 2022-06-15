package com.controller;

import com.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Dictionary {

    @Autowired
    private IDictionaryService iDictionaryService;

    @GetMapping("/dictionary")
    public String show() {
        return "dictionary";
    }

    @GetMapping(value = "/search")
    public String search(@RequestParam String english, Model model) {
        String vietNam = this.iDictionaryService.searchDictionary(english);
        model.addAttribute("vietNam", vietNam);
        return "dictionary";
    }
}