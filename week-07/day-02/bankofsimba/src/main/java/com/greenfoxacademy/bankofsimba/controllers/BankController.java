package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankController {

  @GetMapping("/show")
  public String showAccount(Model model) {
    BankAccount accountOfSimba = new BankAccount("Simba", 2000, "lion");
    model.addAttribute("account", accountOfSimba);
    return "account";
  }
}
