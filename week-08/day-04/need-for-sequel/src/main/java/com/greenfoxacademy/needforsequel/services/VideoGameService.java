package com.greenfoxacademy.needforsequel.services;

import com.greenfoxacademy.needforsequel.models.VideoGame;

import java.util.List;

public interface VideoGameService {

  List<VideoGame> getVideoGames();
  VideoGame getVideoGameById(int videoGameId);
  void saveVideoGame(VideoGame videoGame);
}
