package com.restapi.controller;

import com.restapi.response.LoginResponse;
import com.restapi.service.LoginCitos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/post")
public class ApiController {

    @Autowired
    private LoginCitos service;

    @GetMapping("/index")
    public String Index(){
        return "ini halaman index";
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> LoginCitos(LoginResponse response){
        return service.Login(response);
    }
}
