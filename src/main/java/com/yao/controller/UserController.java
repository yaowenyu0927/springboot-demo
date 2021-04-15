package com.yao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/to")
public class UserController {

    //远程操控
    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("name","asgdf");
        return "system/login";
    }
}
