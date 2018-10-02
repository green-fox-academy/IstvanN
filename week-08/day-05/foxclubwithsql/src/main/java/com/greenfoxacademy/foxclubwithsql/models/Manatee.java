package com.greenfoxacademy.foxclubwithsql.models;

import com.greenfoxacademy.foxclubwithsql.models.enums.Sex;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Manatee {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;
  private Sex sex;

  @ManyToOne
  private Nutrition currentFood;

  @ManyToOne
  private Nutrition currentDrink;

  @ManyToOne
  private User owner;

  public Manatee(String name, Sex sex) {
    this.name = name;
    this.sex = sex;
  }
}
