package com.greenfoxacademy.redditlike.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Post implements Comparable<Post> {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  long id;

  private String title;
  private String content;
  private int numberOfVotes;
  private String dateCreatedAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));


  public void upvote() {
    numberOfVotes++;
  }

  public void downvote() {
    numberOfVotes--;
  }


  @Override
  public int compareTo(Post p) {
    return p.numberOfVotes - this.numberOfVotes;
  }
}
