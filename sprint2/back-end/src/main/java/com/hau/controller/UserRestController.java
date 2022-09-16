package com.hau.controller;

import com.hau.dto.RegisterDTO;
import com.hau.model.account.AppUser;
import com.hau.service.IAppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/rest")
public class UserRestController {
    @Autowired
    private IAppUserService appUserService;

    @PostMapping("/user/register")
    public ResponseEntity<?> getUserRegister(@Valid @RequestBody RegisterDTO registerDTO,
                                             BindingResult bindingResult) {
        RegisterDTO registerRequestDto = new RegisterDTO();
        registerRequestDto.setAppUserList(this.appUserService.getAllUser());
        registerRequestDto.validate(registerDTO, bindingResult);
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(bindingResult.getFieldError(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        this.appUserService.registerUser(registerDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/user")
    public ResponseEntity<List<AppUser>> getAllUser(){
        List<AppUser> appUser = appUserService.getAllUser();
        return new ResponseEntity<>(appUser,HttpStatus.OK);
    }
}