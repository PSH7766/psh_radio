package com.example.psh_radio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/radio")
public class RadioController {

    @GetMapping("/test")
    public String Test(){
        return "/radios/test";
    }

    @GetMapping("/testOutput")
    public String Output(HttpServletRequest httpServletRequest, Model model){
        String radio1 = httpServletRequest.getParameter("test");
        String radio2 = httpServletRequest.getParameter("test1");

        model.addAttribute("radio1", radio1);
        model.addAttribute("radio2", radio2);
        System.out.println("radio1 = " + radio1);
        System.out.println("radio2 = " + radio2);
        return "/radios/testOutput";
    }
}
