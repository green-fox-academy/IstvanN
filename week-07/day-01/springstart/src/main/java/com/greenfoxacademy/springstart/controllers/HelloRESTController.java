package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

  @GetMapping("/greeting")
  public Greeting greet() {
    Greeting greeting = new Greeting(1, "Hello World!");
    return greeting;
  }
}
