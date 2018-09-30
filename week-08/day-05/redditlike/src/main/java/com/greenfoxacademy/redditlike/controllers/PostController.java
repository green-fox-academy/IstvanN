package com.greenfoxacademy.redditlike.controllers;

import com.greenfoxacademy.redditlike.models.Post;
import com.greenfoxacademy.redditlike.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

  @GetMapping("/edit/{id}")
  public String showEditPage(@PathVariable("id") long postId, Model model) {
    Post post = postService.getPostById(postId);
    model.addAttribute("post", post);
    return "edit-post";
  }

  @PostMapping("/edit/{id}")
  public String editPost(@PathVariable("id") long postId, @RequestParam("title") String postTitle, @RequestParam("content") String postContent) {
    Post post = postService.getPostById(postId);
    post.setTitle(postTitle);
    post.setContent(postContent);
    postService.savePost(post);
    return "redirect:/";
  }

  @PostMapping("/delete/{id}")
  public String deletePost(@PathVariable("id") long postId) {
    Post post = postService.getPostById(postId);
    postService.deleteById(postId);
    return "redirect:/";
  }
}
