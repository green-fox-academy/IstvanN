package com.greenfoxacademy.dependencyinjection.controllers;

import com.greenfoxacademy.dependencyinjection.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @Autowired
  UtilityService utilityService;

  @GetMapping("/useful")
  public String showMain() {
    return "useful-utilities";
  }

  @GetMapping("/useful/colored")
  public String showColored(Model model) {
    String randomColor = utilityService.randomColor();
    model.addAttribute("randomColor", randomColor);
    return "colored-background";
  }
}
