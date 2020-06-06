package com.mumu.lp.web.pet.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class PetController {
    @RequestMapping("/hello")
    public String hello(Locale locale, Model model) {
        return "Hello World";
    }

}
