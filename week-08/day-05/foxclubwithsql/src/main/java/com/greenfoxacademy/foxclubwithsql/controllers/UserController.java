package com.greenfoxacademy.foxclubwithsql.controllers;

import com.greenfoxacademy.foxclubwithsql.models.User;
import com.greenfoxacademy.foxclubwithsql.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

  private final UserService userService;

  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/login")
  public String showLoginPage() {
    return "login";
  }

  @GetMapping("/signup")
  public String showSignupPage(Model model) {
    model.addAttribute("user", new User());
    return "sign-up";
  }

  @PostMapping("/signup")
  public String signUp(@ModelAttribute User user, @RequestParam("secondPassword") String secondPassword, Model model) {
    if (user.getPassword().equals(secondPassword)) {
      userService.saveUser(user);
      return "redirect:/login";
    }

    model.addAttribute("wrongPassowrd", true);
    return "sign-up";
  }
}
