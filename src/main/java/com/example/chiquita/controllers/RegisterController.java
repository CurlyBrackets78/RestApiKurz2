package com.example.chiquita.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

  @PostMapping("/user")
  public ResponseEntity<Object> registerUser() {
    return ResponseEntity.ok().build();

  }
}
