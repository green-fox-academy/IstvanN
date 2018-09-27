package com.greenfoxacademy.needforsequel.services;

import com.greenfoxacademy.needforsequel.models.VideoGame;

import java.util.List;

public interface VideoGameService {

  List<VideoGame> getVideoGames();
  VideoGame getVideoGameById(int videoGameId);
  void saveVideoGame(VideoGame videoGame);
  List<VideoGame> filterVideoGamesByAgeAndIncome(String ageOption, int ageValue, String incomeOption, int incomeValue);
}
