package com.api.feiraapp.controller;

import com.api.feiraapp.model.ResponseApiModel;
import com.api.feiraapp.model.UserModel;
import com.api.feiraapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/feira-app/api/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping
    public ResponseApiModel save(@RequestBody  UserModel userModel){
       return userService.save(userModel);
    }

    @PostMapping("/login")
    public ResponseApiModel login(@RequestParam String email, @RequestParam String password){
        return userService.login(email,password);
    }
}
