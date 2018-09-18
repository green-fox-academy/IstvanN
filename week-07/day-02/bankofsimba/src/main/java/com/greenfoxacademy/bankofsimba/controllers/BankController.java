package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

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

  @GetMapping("/accounts")
  public String showListOfAccounts(Model model) {
    List<BankAccount> accounts = Arrays.asList(
        new BankAccount("Simba", 2000, "lion", "Zebra"),
        new BankAccount("Mufasa", 10000, "lion", "Zebra"),
        new BankAccount("Zordon", 3, "lion", "Hyena"),
        new BankAccount("Timon", 5, "meerkat", "Bug"),
        new BankAccount("Pumbaa", 15, "warthog", "Bug")
    );
    model.addAttribute("bankAccounts", accounts);
    return "multipleaccounts";
  }
}
