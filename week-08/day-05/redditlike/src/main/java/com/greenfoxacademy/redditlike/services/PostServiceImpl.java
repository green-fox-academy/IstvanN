package com.greenfoxacademy.redditlike.services;

import com.greenfoxacademy.redditlike.models.Post;
import com.greenfoxacademy.redditlike.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

  private final PostRepository postRepository;

  @Autowired
  public PostServiceImpl(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

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
    post.downvote();
    postRepository.save(post);
  }

  @Override
  public List<Post> getPostsOrderedByVotes() {
    return postRepository.findAllByOrderByNumberOfVotesDescDateCreatedAsc();
  }

  @Override
  public void deleteById(long id) {
    postRepository.deleteById(id);
  }
}
