package com.greenfoxacademy.foxclubwithsql.controllers;

import com.greenfoxacademy.foxclubwithsql.models.Manatee;
import com.greenfoxacademy.foxclubwithsql.models.Nutrition;
import com.greenfoxacademy.foxclubwithsql.services.ManateeService;
import com.greenfoxacademy.foxclubwithsql.services.NutritionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/manatees/{manateeId}")
public class ManateeController {

  private final ManateeService manateeService;
  private final NutritionService nutritionService;

  @Autowired
  public ManateeController(ManateeService manateeService, NutritionService nutritionService) {
    this.manateeService = manateeService;
    this.nutritionService = nutritionService;
  }

  @GetMapping("")
  public String showManateePage(@PathVariable("manateeId") long manateeId, Model model) {
    Manatee manatee = manateeService.getManateeById(manateeId);
    model.addAttribute("manatee", manatee);
    return "manatee-page";
  }

  @GetMapping("/nutritionstore")
  public String showNutritionStore(@PathVariable("manateeId") long manateeId, Model model) {
    Manatee manatee = manateeService.getManateeById(manateeId);
    model.addAttribute("manatee", manatee);
    model.addAttribute("foods", nutritionService.getAllFoods());
    model.addAttribute("drinks", nutritionService.getAllDrinks());
    return "nutrition-store";
  }

  @PostMapping("/nutritionstore")
  public String setNutritionToManatee(@PathVariable("manateeId") long manateeId, @RequestParam("foodId") long foodId, @RequestParam("drinkId") long drinkId) {
    Nutrition food = nutritionService.getFoodById(foodId);
    Nutrition drink = nutritionService.getDrinkById(drinkId);
    manateeService.setFoodAndDrink(manateeId, food, drink);
    return "redirect:/manatees/" + manateeId;
  }
}
