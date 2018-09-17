package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
  AtomicLong generator = new AtomicLong(1);

  @GetMapping("/greeting")
  public Greeting greet(@RequestParam("name") String name) {
    long id = generator.incrementAndGet();
    Greeting greeting = new Greeting(id, String.format("Hello, dear %s!", name.toUpperCase()));
    return greeting;
  }
}
