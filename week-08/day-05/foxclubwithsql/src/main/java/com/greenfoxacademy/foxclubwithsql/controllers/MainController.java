package com.greenfoxacademy.foxclubwithsql.controllers;

import com.greenfoxacademy.foxclubwithsql.models.Manatee;
import com.greenfoxacademy.foxclubwithsql.models.User;
import com.greenfoxacademy.foxclubwithsql.services.ManateeService;
import com.greenfoxacademy.foxclubwithsql.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/club")
public class MainController {

  private final UserService userService;
  private final ManateeService manateeService;

  @Autowired
  public MainController(UserService userService, ManateeService manateeService) {
    this.userService = userService;
    this.manateeService = manateeService;
  }

  @GetMapping("/{id}")
  public String showIndex(@PathVariable("id") long userId, Model model) {
    User user = userService.getUserById(userId);
    if (user == null) {
      return "redirect:/login";
    }

    model.addAttribute("user", user);
    return "index";
  }

  @GetMapping("/{id}/create")
  public String showManateeCreationCenter(@PathVariable("id") long userId, Model model) {
    Manatee newManatee = new Manatee();
    userService.addManateeToUser(userId, newManatee);
    model.addAttribute("manatee", newManatee);
    return "create-manatee";
  }

  @PostMapping("/{id}/create")
  public String createManatee(@PathVariable("id") long userId, @ModelAttribute Manatee manatee) {
    manateeService.saveManatee(manatee);
    return "redirect:/club/" + userId;
  }

}
