package com.greenfoxacademy.redditlike.repositories;

import com.greenfoxacademy.redditlike.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

  List<Post> findAll();
  List<Post> findAllByOrderByNumberOfVotesDescDateCreatedAsc();
}
