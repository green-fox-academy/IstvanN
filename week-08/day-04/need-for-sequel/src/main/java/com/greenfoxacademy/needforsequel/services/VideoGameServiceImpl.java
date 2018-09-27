package com.greenfoxacademy.needforsequel.services;

import com.greenfoxacademy.needforsequel.models.VideoGame;
import com.greenfoxacademy.needforsequel.repositories.VideoGameRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class VideoGameServiceImpl implements VideoGameService {

  @Autowired
  private VideoGameRepository videoGameRepository;

  @Override
  public List<VideoGame> getVideoGames() {
    return videoGameRepository.findAll();
  }

  @Override
  public VideoGame getVideoGameById(int videoGameId) {
    return videoGameRepository.findById(videoGameId).get();
  }
}
