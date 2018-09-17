package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloAllWorldController {

  @GetMapping("/randomhello")
  public String greetRandomly(Model model, @RequestParam("name") String name) {
    RandomHello randomHello = new RandomHello();
    model.addAttribute("name", name.toUpperCase());
    model.addAttribute("randomhello", randomHello.getActualHello());
    return "randomhello";
  }
}
