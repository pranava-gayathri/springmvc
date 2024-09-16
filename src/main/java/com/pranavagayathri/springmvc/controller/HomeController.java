package com.pranavagayathri.springmvc.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HomeController {
    @GetMapping("/hello")
    public ModelAndView home(){
        ModelAndView m=new ModelAndView("index");
        return m;
    }
}
