package com.greenfoxacademy.restexercises.controllers;

import com.greenfoxacademy.restexercises.models.Input;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

  @GetMapping("/doubling")
  public Input doubleTheInput() {
    
  }
}
