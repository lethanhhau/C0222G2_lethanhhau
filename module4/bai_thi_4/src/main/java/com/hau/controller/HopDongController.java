package com.hau.controller;


import com.hau.dto.HopDongDto;
import com.hau.model.HopDong;
import com.hau.model.PhongTro;
import com.hau.service.IHopDongService;
import com.hau.service.IPhongTroService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class HopDongController {

    @Autowired
    private IHopDongService iHopDongService;

    @Autowired
    private IPhongTroService iPhongTroService;

    @ModelAttribute("phongTroList")
    public List<PhongTro> phongTroList(){
        return this.iPhongTroService.findAll();
    }

    @GetMapping("/hopDong-list")
    public String goHomeCustomer( Model model){
        List<HopDong> hopDongs = this.iHopDongService.findAll();
        model.addAttribute("hopDongs", hopDongs);
        return "hopDong/list";
    }

    @GetMapping("/hopDong/delete/{id}")
    public String delete(@PathVariable Integer id, RedirectAttributes redirectAttributes) {
        this.iHopDongService.remove(id);
        redirectAttributes.addFlashAttribute("msgDelete","Successful deletion!");
        return "redirect:/hopDong-list";
    }

    @GetMapping("/hopDong/create")
    public String showCreate(Model model) {
        model.addAttribute("hopDongDto", new HopDongDto());
        return "hopDong/create";
    }


    @PostMapping("/hopDong/create")
    public String create(@Valid @ModelAttribute("hopDongDto")  HopDongDto hopDongDto,
                         BindingResult bindingResult,
                         RedirectAttributes redirectAttributes) {
        new HopDongDto().validate(hopDongDto, bindingResult);
        if (bindingResult.hasErrors()){
            return "hopDong/create";
        }else {
            HopDong hopDong = new HopDong();
            BeanUtils.copyProperties(hopDongDto, hopDong);
            this.iHopDongService.save(hopDong);
            redirectAttributes.addFlashAttribute("success", "Register success!");
            return "redirect:/hopDong-list";
        }
    }

    @GetMapping("/hopDong/edit/{id}")
    public String showEdit(@PathVariable Integer id, Model model) {
        Optional<HopDong> hopDong = this.iHopDongService.findById(id);
        model.addAttribute("hopDong", hopDong);
        return "hopDong/edit";
    }

    @PostMapping("/hopDong/edit")
    public String edit(@ModelAttribute HopDong hopDong, RedirectAttributes redirectAttributes) {
        this.iHopDongService.save(hopDong);
        redirectAttributes.addFlashAttribute("msgEdit", "successful fix!");
        return "redirect:/hopDong-list";
    }
}
