package com.sujit.devops_portfolio.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class DownloadController {

    @GetMapping("/download-resume")
    public ResponseEntity<Resource> downloadResume() throws IOException {
        Resource resource = new ClassPathResource("static/Sujit_Poojari_Resume.pdf");

        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_PDF)
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"Sujit_Poojari_Resume.pdf\"")
                .body(resource);
    }
}
