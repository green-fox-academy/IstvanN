package com.greenfoxacademy.redditlike.controllers;

import com.greenfoxacademy.redditlike.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {

  @Autowired
  PostService postService;

  @GetMapping("/")
  public String showMain(Model model) {
    model.addAttribute("posts", postService.getPosts());
    return "index";
  }
}
