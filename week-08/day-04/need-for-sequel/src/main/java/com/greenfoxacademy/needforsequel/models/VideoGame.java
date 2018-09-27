package com.greenfoxacademy.needforsequel.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class VideoGame {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String title;
  private String company;
  private int income;

  public VideoGame() {
  }

  public VideoGame(String title, String company, int income) {
    this.title = title;
    this.company = company;
    this.income = income;
  }
}
