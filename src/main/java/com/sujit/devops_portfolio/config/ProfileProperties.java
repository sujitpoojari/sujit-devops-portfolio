package com.sujit.devops_portfolio.config;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "")
public class ProfileProperties {

    private Profile profile;
    private String summary;
    private List<Experience> experience;
    private Map<String, List<String>> skills;
    private List<String> awards;

    // getters and setters

    public Profile getProfile() {
        return profile;
    }
    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getSummary() {
        return summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }

    public List<Experience> getExperience() {
        return experience;
    }
    public void setExperience(List<Experience> experience) {
        this.experience = experience;
    }

    public Map<String, List<String>> getSkills() {
        return skills;
    }
    public void setSkills(Map<String, List<String>> skills) {
        this.skills = skills;
    }

    public List<String> getAwards() {
        return awards;
    }
    public void setAwards(List<String> awards) {
        this.awards = awards;
    }

    // Nested classes

    public static class Profile {
        private String name;
        private String role;
        private String experience;
        private String location;
        private String email;

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getRole() { return role; }
        public void setRole(String role) { this.role = role; }

        public String getExperience() { return experience; }
        public void setExperience(String experience) { this.experience = experience; }

        public String getLocation() { return location; }
        public void setLocation(String location) { this.location = location; }

        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }
    }

    public static class Experience {
        private String company;
        private String role;
        private String duration;
        private List<String> highlights;

        public String getCompany() { return company; }
        public void setCompany(String company) { this.company = company; }

        public String getRole() { return role; }
        public void setRole(String role) { this.role = role; }

        public String getDuration() { return duration; }
        public void setDuration(String duration) { this.duration = duration; }

        public List<String> getHighlights() { return highlights; }
        public void setHighlights(List<String> highlights) { this.highlights = highlights; }
    }
}
