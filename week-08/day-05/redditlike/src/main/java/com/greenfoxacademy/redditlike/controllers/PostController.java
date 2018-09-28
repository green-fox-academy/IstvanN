package com.greenfoxacademy.redditlike.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class PostController {

  public String showMain() {
    return "index";
  }
}
