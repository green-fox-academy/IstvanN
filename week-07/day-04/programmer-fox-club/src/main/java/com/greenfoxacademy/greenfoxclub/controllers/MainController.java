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
    Fox fox = getFoxByName(petName);
    model.addAttribute("fox", fox);
    return "index";
  }

  @GetMapping("/login")
  public String showLogin() {
    return "login";
  }

  @PostMapping("/login")
  public String createFoxWithName(@RequestParam("petname") String petName,
                                  @RequestParam("food") String food,
                                  @RequestParam("drink") String drink) {
    Fox fox = new Fox(petName);
    fox.setFood(food);
    fox.setDrink(drink);
    foxes.add(fox);
    return "redirect:/?name=" + petName;
  }

  private Fox getFoxByName(String name) {
    for (Fox fox : foxes) {
      if (fox.getName().equals(name)) {
        return fox;
      }
    }

    return null;
  }
}
