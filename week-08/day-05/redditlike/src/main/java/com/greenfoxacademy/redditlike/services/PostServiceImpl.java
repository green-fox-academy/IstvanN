package com.greenfoxacademy.redditlike.services;

import com.greenfoxacademy.redditlike.models.Post;
import com.greenfoxacademy.redditlike.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

  @Autowired
  private PostRepository postRepository;

  @Override
  public List<Post> getPosts() {
    return postRepository.findAll();
  }

  @Override
  public Post getPostById(long id) {
    return postRepository.findById(id).orElse(null);
  }

  @Override
  public void savePost(Post post) {
    postRepository.save(post);
  }

  @Override
  public void upvotePost(Post post) {
    post.upvote();
    postRepository.save(post);
  }

  @Override
  public void downvotePost(Post post) {

  }


}
