package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankController {
  List<BankAccount> accounts = createList();

  @GetMapping("/show")
  public String showAccount(Model model) {
    model.addAttribute("bankAccount", new BankAccount("Simba", 2000, "lion", "Zebra", true, true));
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
    model.addAttribute("bankAccounts", accounts);
    return "multipleaccounts";
  }

  @PostMapping("/increase")
  public String increaseBalance(@RequestParam(value = "toIncrease") int index) {
    accounts.get(index).raiseBalance();
    return "redirect:/accounts";
  }

  @PostMapping("/addaccount")
  public String addAccount(@RequestParam(value = "owner") String name,
                           @RequestParam(value = "animaltype") String type,
                           @RequestParam(value = "king") boolean isKing,
                           @RequestParam(value = "goodboi") boolean isGoodGuy,
                           @RequestParam(value = "currency") String currency,
                           @RequestParam(value = "startingmoney") int startingMoney) {
    accounts.add(new BankAccount(name, startingMoney, type, currency, isKing, isGoodGuy));
    return "redirect:/accounts";
  }

  @PostMapping("/remove")
  public String removeAccount(@RequestParam(value = "toRemove") int index) {
    accounts.remove(index);
    return "redirect:/accounts";
  }

  public List<BankAccount> createList() {
    List<BankAccount> accounts = new ArrayList<>();
    accounts.add(new BankAccount("Simba", 2000, "lion", "Zebra", true, true));
    accounts.add(new BankAccount("Mufasa", 10000, "lion", "Zebra", false, true));
    accounts.add(new BankAccount("Zordon", 3, "lion", "Hyena", false, false));
    accounts.add(new BankAccount("Timon", 5, "meerkat", "Bug", false, true));
    accounts.add(new BankAccount("Pumbaa", 15, "warthog", "Bug", false, true));

    return accounts;
  }
}
