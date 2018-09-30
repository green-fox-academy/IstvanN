package com.greenfoxacademy.redditlike.controllers;

import com.greenfoxacademy.redditlike.models.Post;
import com.greenfoxacademy.redditlike.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class PostController {

  private final
  PostService postService;

  @Autowired
  public PostController(PostService postService) {
    this.postService = postService;
  }

  @GetMapping("/")
  public String showMain(Model model) {
    List<Post> posts = postService.getPostsOrderedByVotes();
    model.addAttribute("posts", posts);
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

  @PostMapping(value = "/upvote/{id}")
  public String upvotePost(@PathVariable("id") long postId) {
    Post post = postService.getPostById(postId);
    postService.upvotePost(post);
    return "redirect:/";
  }

  @PostMapping("/downvote/{id}")
  public String downvotePost(@PathVariable("id") long postId) {
    Post post = postService.getPostById(postId);
    postService.downvotePost(post);
    return "redirect:/";
  }
}
