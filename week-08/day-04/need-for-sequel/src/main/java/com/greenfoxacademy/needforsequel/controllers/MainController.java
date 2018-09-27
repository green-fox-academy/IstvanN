package com.greenfoxacademy.needforsequel.controllers;

import com.greenfoxacademy.needforsequel.models.VideoGame;
import com.greenfoxacademy.needforsequel.repositories.VideoGameRepository;
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
  public String showFiltered(@RequestParam(value = "ageOption") String ageOption,
                             @RequestParam(value = "ageValue") int ageValue,
                             @RequestParam(value = "incomeOption") String incomeOption,
                             @RequestParam(value = "incomeValue") int incomeValue,
                             Model model) {
    List<VideoGame> games = videoGameService.filterVideoGamesByAgeAndIncome(ageOption, ageValue, incomeOption, incomeValue);

    model.addAttribute("games", games);
    return "index";
  }

}
