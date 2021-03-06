package com.greenfoxacademy.greenfoxclub.controllers;

import com.greenfoxacademy.greenfoxclub.models.Fox;
import com.greenfoxacademy.greenfoxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;
import java.util.List;

@Controller
public class TrickController {

  private List<String> tricks = Arrays.asList("football", "squash", "bassguitar");

  @Autowired
  FoxService foxService;

  @GetMapping("/trickCenter")
  public String showTrickCenter(@RequestParam("name") String petName, Model model) {
    Fox fox = foxService.getFoxByName(petName);
    model.addAttribute("fox", fox);
    model.addAttribute("tricks", tricks);
    return "trick-center";
  }

  @PostMapping("/trickCenter")
  public String setFoxTricks(@RequestParam("name") String petName,
                             @RequestParam("trick") String trick,
                             RedirectAttributes redir) {
    Fox fox = foxService.getFoxByName(petName);
    fox.teachTrick(trick);
    redir.addAttribute("name", petName);
    return "redirect:/";
  }
}
