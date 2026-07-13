package com.example.ipwijaevents.controller;

import com.example.ipwijaevents.service.AttendanceService;
import com.example.ipwijaevents.service.CertificateService;
import com.example.ipwijaevents.service.EventService;
import com.example.ipwijaevents.service.RegistrationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @Autowired
    private EventService eventService;

    @Autowired
    private RegistrationService registrationService;

    @Autowired
    private AttendanceService attendanceService;

    @Autowired
    private CertificateService certificateService;

    @GetMapping("/dashboard")
    public String dashboard(Model model) {

        model.addAttribute("totalEvents",
                eventService.findAll().size());

        model.addAttribute("totalRegistrations",
                registrationService.findAll().size());

        model.addAttribute("totalAttendance",
                attendanceService.findAll().size());

        model.addAttribute("totalCertificates",
                certificateService.findAll().size());

        return "dashboard";
    }

}