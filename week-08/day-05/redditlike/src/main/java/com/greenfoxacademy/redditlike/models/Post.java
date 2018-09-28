package com.greenfoxacademy.redditlike.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  long id;

  String title;
  String content;
  int numberOfVotes;

  public void upvote() {
    numberOfVotes++;
  }

  public void downvote() {
    numberOfVotes--;
  }
}
