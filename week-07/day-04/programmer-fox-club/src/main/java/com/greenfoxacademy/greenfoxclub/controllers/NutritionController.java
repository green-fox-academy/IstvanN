package com.greenfoxacademy.greenfoxclub.controllers;

import com.greenfoxacademy.greenfoxclub.models.Fox;
import com.greenfoxacademy.greenfoxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;
import java.util.List;

@Controller
public class NutritionController {

  private List<String> foods = Arrays.asList("burger", "vega");
  private List<String> drinks = Arrays.asList("beer", "milk");
  @Autowired
  FoxService foxService;

  @GetMapping("/nutritionStore")
  public String showNutritionStore(@RequestParam("name") String petName, Model model) {
    Fox fox = foxService.getFoxByName(petName);
    model.addAttribute("fox", fox);
    model.addAttribute("foods", foods);
    model.addAttribute("drinks", drinks);

    return "nutrition-store";
  }

  @PostMapping("/nutritionStore")
  public String setFoxNewFoodAndDrink(@ModelAttribute Fox fox, RedirectAttributes redir) {
    redir.addAttribute("name", fox.getName());
    return "index";
  }

}
