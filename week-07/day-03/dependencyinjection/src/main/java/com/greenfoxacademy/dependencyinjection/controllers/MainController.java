package com.greenfoxacademy.dependencyinjection.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @GetMapping("/useful")
  public String showMain() {
    return "useful-utilities";
  }
}
