package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Controller
public class HelloAllWorldController {

  @GetMapping("/randomhello")
  public String greetRandomly(Model model, @RequestParam("name") String name) {
    Random random = new Random();
    int randomRGB = random.nextInt(256);
    RandomHello randomHello = new RandomHello();
    model.addAttribute("name", name.toUpperCase());
    model.addAttribute("randomhello", randomHello.getActualHello().toUpperCase());
    model.addAttribute("rgb", randomRGB + ", " + randomRGB + ", " + randomRGB);
    return "randomhello";
  }
}
