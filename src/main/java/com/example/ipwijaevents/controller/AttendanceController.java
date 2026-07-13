package com.example.ipwijaevents.controller;

import com.example.ipwijaevents.service.AttendanceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    @GetMapping("/attendance")
    public String attendance(Model model){

        model.addAttribute("attendances",
                attendanceService.findAll());

        return "attendance";
    }

}