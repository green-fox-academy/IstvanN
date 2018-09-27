package com.greenfoxacademy.needforsequel.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  @GetMapping("/")
  public String showIndex() {
    return "index";
  }

  @PostMapping("/filter")
  public String filterVideoGames() {
    return "redirect:/";
  }
}
