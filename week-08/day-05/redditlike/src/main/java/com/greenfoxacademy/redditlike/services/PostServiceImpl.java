package com.greenfoxacademy.redditlike.services;

import com.greenfoxacademy.redditlike.models.Post;
import com.greenfoxacademy.redditlike.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PostServiceImpl implements PostService {

  @Autowired
  private PostRepository postRepository;

  @Override
  public List<Post> getPosts() {
    return postRepository.findAll();
  }

  @Override
  public Post getPostById(long id) {
    return postRepository.findById();
  }
}
