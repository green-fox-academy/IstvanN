package com.greenfoxacademy.redditlike.controllers;

import com.greenfoxacademy.redditlike.models.Post;
import com.greenfoxacademy.redditlike.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {

  @Autowired
  PostService postService;

  @GetMapping("/")
  public String showMain(Model model) {
    model.addAttribute("posts", postService.getPosts());
    return "index";
  }

  @GetMapping("/submit")
  public String showSubmitForm(Model model) {
    model.addAttribute("post", new Post());
    return "submit-new";
  }

  @PostMapping("/submit")
  public String submitNewPost(@ModelAttribute Post post) {
    postService.savePost(post);
    return "redirect:/";
  }
}
