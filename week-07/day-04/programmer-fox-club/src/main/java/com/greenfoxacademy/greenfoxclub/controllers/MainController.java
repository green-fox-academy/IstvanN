package com.greenfoxacademy.greenfoxclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @GetMapping("/")
  public String index(@RequestParam("name") String name, Model model) {
    if (name.isEmpty()) {
      return "login";
    }
    model.addAttribute("petname", name);
    return "index";
  }

  @GetMapping("/login")
  public String showLogin() {
    return "login";
  }

  @PostMapping("/login")
  public String receivePetName(@RequestParam(value = "petname") String name) {
    return "redirect:/?name=" + name;
  }
}
