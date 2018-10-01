package com.greenfoxacademy.restexercises.controllers;

import com.greenfoxacademy.restexercises.models.Doubling;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

  @GetMapping("/doubling")
  public Doubling doubleTheInput(@RequestParam(value = "input") Integer input) {
    if (input != null) {
      Doubling doubling = new Doubling();
      doubling.setRecieved(input);
      doubling.doubleRecieved();
      return doubling;
    }

    
  }
