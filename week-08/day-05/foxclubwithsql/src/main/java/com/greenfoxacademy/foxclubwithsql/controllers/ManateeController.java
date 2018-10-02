package com.greenfoxacademy.foxclubwithsql.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/{userId}/{manateeId}")
public class ManateeController {

  @GetMapping("")
  public String showManateePage(@PathVariable("userId") String userId, @PathVariable("manateeId") String manateeId) {

    return "manatee-page";
  }
}
