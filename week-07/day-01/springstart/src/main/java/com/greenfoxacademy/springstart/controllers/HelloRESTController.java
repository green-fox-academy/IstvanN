package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

  @GetMapping("/greeting")
  public Greeting greet(@RequestParam("name") String name) {
    Greeting greeting = new Greeting(1, String.format("Hello, dear %s!", name.toUpperCase()));
    return greeting;
  }
}
