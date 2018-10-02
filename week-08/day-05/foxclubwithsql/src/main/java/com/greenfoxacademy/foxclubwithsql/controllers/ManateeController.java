package com.greenfoxacademy.foxclubwithsql.controllers;

import com.greenfoxacademy.foxclubwithsql.models.Manatee;
import com.greenfoxacademy.foxclubwithsql.services.ManateeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/manatees/{manateeId}")
public class ManateeController {

  private final ManateeService manateeService;

  @Autowired
  public ManateeController(ManateeService manateeService) {
    this.manateeService = manateeService;
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
    return "nutrition-store";
  }
}
