package com.sujit.devops_portfolio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sujit.devops_portfolio.model.ProfileDTO;
import com.sujit.devops_portfolio.service.ProfileService;

@RestController
@RequestMapping("/api")
public class ProfileController {

    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping("/profile")
    public ProfileDTO getProfile() {
        return profileService.getProfileDTO();
    }
}
