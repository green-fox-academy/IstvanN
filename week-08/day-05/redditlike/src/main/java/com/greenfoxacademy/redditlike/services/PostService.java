package com.greenfoxacademy.redditlike.services;

import com.greenfoxacademy.redditlike.models.Post;

import java.util.List;

public interface PostService {

  List<Post> getPosts();
  Post getPostById(long id);
}
