package com.example.ipwijaevents.controller;

import com.example.ipwijaevents.service.CertificateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CertificateController {

    @Autowired
    private CertificateService certificateService;

    @GetMapping("/certificates")
    public String certificates(Model model){

        model.addAttribute("certificates",
                certificateService.findAll());

        return "certificates";
    }

}