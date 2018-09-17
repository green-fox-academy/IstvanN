package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
  AtomicLong atomicLongGenerator = new AtomicLong(1);

  @GetMapping("/web/greeting")
  public String greeting(Model model, @RequestParam("name") String name) {
    long serverSetupTime = atomicLongGenerator.incrementAndGet();
    model.addAttribute("name", name);
    model.addAttribute("serverSetupTime", serverSetupTime);
    return "greeting";
  }
}
