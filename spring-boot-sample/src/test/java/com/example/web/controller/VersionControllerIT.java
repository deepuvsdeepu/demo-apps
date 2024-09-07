package com.example.web.controller;

import com.example.web.controller.VersionController.VersionResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class VersionControllerIT {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void shouldReturnVersion() {
        final var response = restTemplate.getForObject("/version", VersionResponse.class);
        assertEquals("v2", response.version());
    }
}
