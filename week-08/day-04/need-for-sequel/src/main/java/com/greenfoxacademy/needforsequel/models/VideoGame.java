package com.greenfoxacademy.needforsequel.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VideoGame {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String title;
  private String company;
  private int age;
  private int soldCopy;
  private int income;

  public VideoGame() {
  }

  public VideoGame(String title, String company, int income, int age, int soldCopy) {
    this.title = title;
    this.company = company;
    this.income = income;
    this.age = age;
    this.soldCopy = soldCopy;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public int getIncome() {
    return income;
  }

  public void setIncome(int income) {
    this.income = income;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getSoldCopy() {
    return soldCopy;
  }

  public void setSoldCopy(int soldCopy) {
    this.soldCopy = soldCopy;
  }
}
