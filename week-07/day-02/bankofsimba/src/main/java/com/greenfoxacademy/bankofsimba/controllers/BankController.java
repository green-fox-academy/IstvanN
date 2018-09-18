package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankController {

  @GetMapping("/show")
  public String showAccount(Model model) {
    model.addAttribute("bankAccount", new BankAccount("Simba", 2000, "lion", "Zebra"));
    return "account";
  }

  @GetMapping("/ception")
  public String HTMLception(Model model) {
    String enjoy = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("enjoy", enjoy);
    return "ception";
  }
}
