package com.greenfoxacademy.greenfoxclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
public class NutritionController {

  List<String> foods = createFoods();
  List<String> drinks = createDrinks();

  @GetMapping("/nutritionStore")
  public String showNutritionStore(@RequestParam("petname") String petName, Model model) {
    model.addAttribute("foods", foods);
    model.addAttribute("drinks", drinks);

    return "redirect:/nutritionStore?name=" + petName;
  }

  private List<String> createFoods() {
    return Arrays.asList("burger", "vega");
  }

  private List<String> createDrinks() {
    return Arrays.asList("beer", "milk");
  }
}
