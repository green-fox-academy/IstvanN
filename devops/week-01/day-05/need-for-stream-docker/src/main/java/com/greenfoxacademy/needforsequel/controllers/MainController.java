package com.greenfoxacademy.needforsequel.controllers;

import com.greenfoxacademy.needforsequel.models.VideoGame;
import com.greenfoxacademy.needforsequel.services.VideoGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MainController {

  @Autowired
  private VideoGameService videoGameService;

  @RequestMapping("/")
  public String showIndex(Model model) {
    model.addAttribute("games", videoGameService.getVideoGames());
    return "index";
  }

  @GetMapping("/filter")
  public String showFiltered(@RequestParam(value = "ageOption", required = false) String ageOption,
                             @RequestParam(value = "ageValue", required = false, defaultValue = "0") int ageValue,
                             @RequestParam(value = "incomeOption", required = false) String incomeOption,
                             @RequestParam(value = "incomeValue", required = false, defaultValue = "0") int incomeValue,
                             @RequestParam(value = "copyOption", required = false) String copyOption,
                             @RequestParam(value = "copyValue", required = false, defaultValue = "0") int copyValue,
                             Model model) {
    List<VideoGame> games = videoGameService.filterVideoGamesByAgeIncomeSoldCopy(ageOption, ageValue, incomeOption, incomeValue, copyOption, copyValue);

    model.addAttribute("games", games);
    return "index";
  }

}
