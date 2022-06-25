package com.hau.controller;


import com.hau.dto.UserDto;
import com.hau.model.User;
import com.hau.service.IUserService;

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
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService iUserService;

    @GetMapping("/home")
    public String goHome
            (@PageableDefault(value = 5) Pageable pageable,
             Model model,
             @RequestParam Optional<String> searchParam) {
        String searchValue = searchParam.orElse("");
        Page<User> users = this.iUserService.findAll(pageable, searchValue);
        model.addAttribute("searchValue", searchValue);
        model.addAttribute("users", users);
        return "list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        this.iUserService.remove(id);
        return "redirect:/user/home";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("userDto", new UserDto());
        return "create";
    }

    @PostMapping("/create")
    public String create(@Valid @ModelAttribute("userDto")  UserDto userDto,
                         BindingResult bindingResult,
                         RedirectAttributes redirectAttributes,
                         Model model) {
        new UserDto().validate(userDto, bindingResult);
        if (bindingResult.hasErrors()){
            return "create";
        }else {
            User user = new User();
            BeanUtils.copyProperties(userDto, user);
            this.iUserService.save(user);
            redirectAttributes.addFlashAttribute("success", "Register success!");
            return "redirect:/user/home";
        }
    }

    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable int id, Model model) {
        User user = this.iUserService.getById(id);
        model.addAttribute("user", user);
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute User user) {
        this.iUserService.save(user);
        return "redirect:/user/home";
    }

    @GetMapping("/detail/{id}")
    public String showDetail(@PathVariable int id, Model model) {
        User user = this.iUserService.getById(id);
        model.addAttribute("user", user);
        return "details";
    }
}
