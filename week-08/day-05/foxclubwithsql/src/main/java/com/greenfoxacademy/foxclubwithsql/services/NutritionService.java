package com.greenfoxacademy.foxclubwithsql.services;

import com.greenfoxacademy.foxclubwithsql.models.Nutrition;

import java.util.List;

public interface NutritionService {
  List<Nutrition> getAllFoods();
  List<Nutrition> getAllDrinks();
}
