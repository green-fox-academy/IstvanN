package com.greenfoxacademy.needforsequel.controllers;

import com.greenfoxacademy.needforsequel.services.VideoGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  @Autowired
  private VideoGameService videoGameService;

  @GetMapping("/")
  public String showIndex(Model model) {
    model.addAttribute("games", videoGameService.getVideoGames());
    return "index";
  }

  @PostMapping("/filter")
  public String filterVideoGames() {
    return "redirect:/";
  }
}
