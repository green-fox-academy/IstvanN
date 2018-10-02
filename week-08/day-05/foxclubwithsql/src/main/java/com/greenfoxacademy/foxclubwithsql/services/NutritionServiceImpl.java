package com.greenfoxacademy.foxclubwithsql.services;

import com.greenfoxacademy.foxclubwithsql.models.Nutrition;
import com.greenfoxacademy.foxclubwithsql.models.NutritionType;
import com.greenfoxacademy.foxclubwithsql.repositories.NutritionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class NutritionServiceImpl implements NutritionService {

  private final NutritionRepository nutritionRepository;

  @Autowired
  public NutritionServiceImpl(NutritionRepository nutritionRepository) {
    this.nutritionRepository = nutritionRepository;
  }

  @Override
  public List<Nutrition> getAllFoods() {
    return nutritionRepository.findAllByType(NutritionType.FOOD);
  }

  @Override
  public List<Nutrition> getAllDrinks() {
    return nutritionRepository.findAllByType(NutritionType.DRINK);
  }
}
