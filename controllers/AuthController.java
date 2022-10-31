/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.otaviolube.bolao.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author alunolab10
 */
@Controller
public class AuthController {
    
    @GetMapping(value = "/login")
    public String login(){
        
        //Toda a lógica de login
        
        return "login";
    }
    
    @GetMapping(value = "/register")
    public String register(){
        
        //Toda a lógica de registro
        
        return "register";
        
    }
    
    @GetMapping(value = "/forgot-password")
    public String forgot_password(){
        return "forgot-password";
    }
    
    @GetMapping(value = "/index")
    public String index(){
        return "index";
    }
    
}
