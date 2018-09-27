package com.greenfoxacademy.needforsequel.repositories;

import com.greenfoxacademy.needforsequel.models.VideoGame;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoGameRepository extends CrudRepository<VideoGame, Integer> {

  List<VideoGame> findAll();
  List<VideoGame> findAllByAgeGreaterThanEqual(int number);
  List<VideoGame> findAllByAgeLessThanEqual(int number);
}
