package com.sujit.devops_portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sujit.devops_portfolio.service.ProfileService;

@Controller
public class UiController {

    private final ProfileService profileService;

    public UiController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping("/")
    public String home(Model model) {
        // Pass ProfileDTO to Thymeleaf template
        model.addAttribute("profileData", profileService.getProfileDTO());
        return "index";
    }
}
