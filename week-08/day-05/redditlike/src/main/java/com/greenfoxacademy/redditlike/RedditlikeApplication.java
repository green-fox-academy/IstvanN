package com.greenfoxacademy.redditlike;

import com.greenfoxacademy.redditlike.models.Post;
import com.greenfoxacademy.redditlike.repositories.PostRepository;
import com.greenfoxacademy.redditlike.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditlikeApplication implements CommandLineRunner {

  @Autowired
  PostRepository postRepository;

  public static void main(String[] args) {
    SpringApplication.run(RedditlikeApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    postRepository.save(new Post(1, "Wow!", "Check this out", 0));

  }
}
