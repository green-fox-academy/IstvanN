package com.greenfoxacademy.greenfoxclub.controllers;

import com.greenfoxacademy.greenfoxclub.containers.FoxContainer;
import com.greenfoxacademy.greenfoxclub.models.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @GetMapping("/")
  public String index(@RequestParam(value = "name", required = false) String petName, Model model, FoxContainer foxContainer) {
    if (petName == null) {
      return "redirect:/login";
    }
    Fox fox = foxContainer.getFoxByName(petName);
    model.addAttribute("fox", fox);
    return "index";
  }

  @GetMapping("/login")
  public String showLogin() {
    return "login";
  }

  @PostMapping("/login")
  public String createFoxWithName(@RequestParam("petname") String petName, FoxContainer foxContainer) {
    Fox fox = new Fox(petName);
    fox.setFood("burger");
    fox.setDrink("beer");
    foxContainer.addFox(fox);
    return "redirect:/?name=" + petName;
  }

}
