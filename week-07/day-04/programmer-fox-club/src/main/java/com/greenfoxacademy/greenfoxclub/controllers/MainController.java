package com.greenfoxacademy.greenfoxclub.controllers;

import com.greenfoxacademy.greenfoxclub.models.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
  List<Fox> foxes = new ArrayList<>();

  @GetMapping("/")
  public String index(@RequestParam(value = "name", required = false) String petName, Model model) {
    if (petName == null) {
      return "redirect:/login";
    }

    model.addAttribute("petname", petName);
    return "index";
  }

  @GetMapping("/login")
  public String showLogin() {
    return "login";
  }

  @PostMapping("/login")
  public String createFoxWithName(@RequestParam(value = "petname") String petName) {
    Fox fox = new Fox(petName);
    foxes.add(fox);
    return "redirect:/?name=" + petName;
  }
}
