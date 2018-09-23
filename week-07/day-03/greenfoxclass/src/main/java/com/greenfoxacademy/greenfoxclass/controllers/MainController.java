package com.greenfoxacademy.greenfoxclass.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @GetMapping("/gfa")
  public String index() {
    return "index";
  }

  @GetMapping("/gfa/list")
  public String showStudentsList() {
    return "students";
  }
}
