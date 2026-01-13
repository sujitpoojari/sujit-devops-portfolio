package com.sujit.devops_portfolio.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.sujit.devops_portfolio.config.ProfileProperties;
import com.sujit.devops_portfolio.model.ProfileDTO;

@Service
public class ProfileService {

    private final ProfileProperties profileProperties;

    public ProfileService(ProfileProperties profileProperties) {
        this.profileProperties = profileProperties;
    }

    public ProfileDTO getProfileDTO() {
        ProfileDTO dto = new ProfileDTO();

        // Map profile
        ProfileProperties.Profile p = profileProperties.getProfile();
        ProfileDTO.Profile profileDto = new ProfileDTO.Profile();
        profileDto.setName(p.getName());
        profileDto.setRole(p.getRole());
        profileDto.setExperience(p.getExperience());
        profileDto.setLocation(p.getLocation());
        profileDto.setEmail(p.getEmail());
        dto.setProfile(profileDto);

        // Map summary
        dto.setSummary(profileProperties.getSummary());

        // Map experience list
        List<ProfileDTO.Experience> expList = profileProperties.getExperience().stream().map(e -> {
            ProfileDTO.Experience expDto = new ProfileDTO.Experience();
            expDto.setCompany(e.getCompany());
            expDto.setRole(e.getRole());
            expDto.setDuration(e.getDuration());
            expDto.setHighlights(e.getHighlights());
            return expDto;
        }).collect(Collectors.toList());
        dto.setExperience(expList);

        // Map skills
        dto.setSkills(profileProperties.getSkills());

        // Map awards
        dto.setAwards(profileProperties.getAwards());

        return dto;
    }
}
