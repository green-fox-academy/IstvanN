package com.greenfoxacademy.greenfoxclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
public class NutritionController {

  private List<String> foods = Arrays.asList("burger", "vega");
  private List<String> drinks = Arrays.asList("beer", "milk");

  @GetMapping("/nutritionStore")
  public String showNutritionStore(@RequestParam("name") String petName, Model model) {
    model.addAttribute("foods", foods);
    model.addAttribute("drinks", drinks);

    return "nutrition-store";
  }

}
