package com.dev.springsecurity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @GetMapping
    public ResponseEntity<String> greet(){
        return ResponseEntity.ok("Hellooooo");
    }

    @GetMapping("/see-you-later")
    public ResponseEntity<String> sayBye(){
        return ResponseEntity.ok("We hope you to see you later ;)!");
    }
}
