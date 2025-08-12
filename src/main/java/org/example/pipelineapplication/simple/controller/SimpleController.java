package org.example.pipelineapplication.simple.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1")
@Slf4j
public class SimpleController {

    @GetMapping("/getSentence")
    public ResponseEntity<String> getSentence() {
        log.info("github Webhook Test By ngrok");
        return ResponseEntity.status(HttpStatus.OK).body("Hello, World");
    }
}
