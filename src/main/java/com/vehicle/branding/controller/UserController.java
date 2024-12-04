package com.vehicle.branding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle.branding.entity.User;
import com.vehicle.branding.modal.ResponseData;
import com.vehicle.branding.service.UserService;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class UserController {


    @Autowired
    private UserService userSerice;


    @PostMapping("/register")
    public ResponseEntity<ResponseData> registerUser(@RequestBody User user) {
        ResponseData<User> res = new ResponseData<>(); 
        try {
            User savedUser=  userSerice.registerUser(user);
            res.setData(savedUser);
            res.setInfo("User registered");
            res.setStatus("Success"); 
        } catch (Exception e) { 
            res.setInfo("User not registered");
            res.setStatus("Failed");
        } 
        return new ResponseEntity<>(res, HttpStatus.OK); 
    }
    
    
}
