package com.hau.controller;

import com.hau.dto.MusicDto;
import com.hau.model.Music;
import com.hau.service.IMusicService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("/music")
public class MusicController {
    @Autowired
    private IMusicService iMusicService;

    @GetMapping("/home")
    public String goHome
            (@PageableDefault(value = 5) Pageable pageable,
             Model model,
             @RequestParam Optional<String> searchParam) {
        String searchValue = searchParam.orElse("");
        Page<Music> musics = this.iMusicService.findAll(pageable, searchValue);
        model.addAttribute("searchValue", searchValue);
        model.addAttribute("musics", musics);
        return "list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        this.iMusicService.remove(id);
        return "redirect:/music/home";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("musicDto", new MusicDto());
        return "create";
    }

    @PostMapping("/create")
    public String create(@Valid @ModelAttribute("musicDto")  MusicDto musicDto,
                         BindingResult bindingResult,
                         RedirectAttributes redirectAttributes,
                         Model model) {
        new MusicDto().validate(musicDto, bindingResult);
        if (bindingResult.hasErrors()){
            return "create";
        }else {
            Music music = new Music();
            BeanUtils.copyProperties(musicDto, music);
            this.iMusicService.save(music);
            redirectAttributes.addFlashAttribute("success", "Register success!");
            return "redirect:/music/home";
        }
    }

    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable int id, Model model) {
        Music music = this.iMusicService.getById(id);
        MusicDto musicDto = new MusicDto();
        BeanUtils.copyProperties(music, musicDto);
        model.addAttribute("music", musicDto);
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@Valid @ModelAttribute("music") MusicDto musicDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "edit";
        } else {
            Music music = new Music();
            BeanUtils.copyProperties(musicDto, music);
            this.iMusicService.save(music);
            return "redirect:/music/home";
        }
    }
    @GetMapping("/detail/{id}")
    public String showDetail(@Valid @PathVariable int id, Model model) {
        Music music = this.iMusicService.getById(id);
        model.addAttribute("music", music);
        return "details";
    }



}
