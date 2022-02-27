package com.gfg.java_webinar.controller;

import com.gfg.java_webinar.dto.UserDTO;
import com.gfg.java_webinar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // here this means we are going return data response:
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/saveUser")
    public String saveUser(@RequestBody UserDTO userDTO){
        userService.saveUser(userDTO);
        return "Successfully add the data into database.";
    }

}
