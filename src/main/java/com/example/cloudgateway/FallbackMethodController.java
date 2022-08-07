package com.example.cloudgateway;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {
    @GetMapping("/projectServiceFallback")
    public ResponseEntity<String> projectServiceFallbackMethod() {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Project service is taking longer than expected");
    }

    @GetMapping("/staffServiceFallback")
    public ResponseEntity<String> staffServiceFallbackMethod() {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Staff service is taking longer than expected");
    }
}
