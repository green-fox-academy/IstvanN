package com.greenfoxacademy.foxclubwithsql.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Nutrition {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private NutritionType type;
  private String name;

  @OneToMany(cascade = CascadeType.PERSIST)
  List<Manatee> consumers;
}
