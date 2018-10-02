package com.greenfoxacademy.foxclubwithsql.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/manatees/{manateeId}")
public class ManateeController {

  @GetMapping("")
  public String showManateePage(@PathVariable("manateeId") String manateeId, Model model) {

    model.addAttribute()
    return "manatee-page";
  }
}
