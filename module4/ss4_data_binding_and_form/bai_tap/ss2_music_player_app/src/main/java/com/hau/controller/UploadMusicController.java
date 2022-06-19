package com.hau.controller;

import com.hau.model.UploadMusic;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UploadMusicController {
    @GetMapping("/")
    public String showMusic(ModelMap modelMap) {
        modelMap.addAttribute("music", new UploadMusic());
        return "music";
    }

    @PostMapping("/uploadMusic")
    public String uploadMusic(@ModelAttribute("music") UploadMusic uploadMusic, ModelMap modelMap) {
        modelMap.addAttribute("uploadMusic", uploadMusic);
        return "music";
    }

}
