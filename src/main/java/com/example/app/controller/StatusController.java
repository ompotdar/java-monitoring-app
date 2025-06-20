package com.example.app.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class StatusController {

    private static final Logger logger = LogManager.getLogger(StatusController.class);

    @GetMapping("/ok")
    public ResponseEntity<String> ok() {
        logger.info("200 OK endpoint called");
        return ResponseEntity.ok("All Good!");
    }

    @GetMapping("/bad")
    public ResponseEntity<String> bad() {
        logger.warn("400 Bad Request endpoint called");
        return ResponseEntity.badRequest().body("Bad Request");
    }

    @GetMapping("/error")
    public ResponseEntity<String> error() {
        logger.error("500 Internal Server Error endpoint called");
        return ResponseEntity.status(500).body("Internal Server Error");
    }
}
