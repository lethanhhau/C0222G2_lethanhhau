package com.hau.controller;

import com.hau.model.Music;
import com.hau.service.IMusicService;
import com.hau.service.impl.MusicServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/music")
public class MusicController {
    private final IMusicService iMusicService = new MusicServiceImpl();

    @GetMapping("")
    public String index(Model model) {
        List<Music> musicList = iMusicService.findAll();
        model.addAttribute("musics", musicList);
        return "/index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("music", new Music());
        return "/create";
    }

    @PostMapping("/save")
    public String save(Music music) {
        iMusicService.save(music);
        return "redirect:/music";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("music", iMusicService.findById(id));
        return "/edit";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Music music) {
        iMusicService.update(music);
        return "redirect:/music";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("music", iMusicService.findById(id));
        return "/delete";
    }

    @PostMapping("/delete")
    public String delete(Music music, RedirectAttributes redirect) {
        iMusicService.remove(music.getId());
        redirect.addFlashAttribute("success", "Removed music successfully!");
        return "redirect:/music";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("music", iMusicService.findById(id));
        return "/view";
    }

}
