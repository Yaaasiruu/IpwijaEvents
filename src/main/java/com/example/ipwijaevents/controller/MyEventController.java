package com.example.ipwijaevents.controller;

import com.example.ipwijaevents.service.RegistrationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyEventController {

    @Autowired
    private RegistrationService registrationService;

    @GetMapping("/my-events")
    public String myEvents(Model model){

        model.addAttribute("registrations",
                registrationService.findAll());

        return "my-events";
    }

}