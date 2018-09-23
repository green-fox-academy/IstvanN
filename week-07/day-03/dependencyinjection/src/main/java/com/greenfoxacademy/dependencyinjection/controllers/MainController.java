package com.greenfoxacademy.dependencyinjection.controllers;

import com.greenfoxacademy.dependencyinjection.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {

  @Autowired
  UtilityService utilityService;

  @GetMapping("/useful")
  public String showMain() {
    return "useful-utilities";
  }

  @GetMapping("/useful/colored")
  public String showColored(Model model) {
    String randomColor = utilityService.randomColor();
    model.addAttribute("randomColor", randomColor);
    return "colored-background";
  }

  @GetMapping("/useful/email")
  public String validateEmail(@RequestParam("email") String emailAddress, Model model) {
    boolean isEmail = utilityService.validateEmail(emailAddress);
    model.addAttribute("emailAddress", emailAddress);
    model.addAttribute("isEmail", isEmail);
    return "email";
  }

  @GetMapping("/useful/decoder")
  public String showDecodedText(@RequestParam("text") String caesaredText, Model model) {
    model.addAttribute("caesaredText", caesaredText);
    return "decoded-message";
  }

  @PostMapping("/useful/decoder")
  public String sendTextToDecode(@RequestParam("textToDecode") String textToDecode,
                                 @RequestParam("number") int numberToBeDecodedWith,
                                 RedirectAttributes redir) {
    String caesaredText = utilityService.caesar(textToDecode, numberToBeDecodedWith);
    redir.addAttribute("text", caesaredText);
    return "redirect:/useful/decoder/";
  }
}
