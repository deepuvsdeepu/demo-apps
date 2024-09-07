package com.example.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {
    public record VersionResponse(String version) {}

    @GetMapping("/version")
    public VersionResponse version() {
        return new VersionResponse("v2");
    }
}
