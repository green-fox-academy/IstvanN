package com.greenfoxacademy.needforsequel.services;

import com.greenfoxacademy.needforsequel.models.VideoGame;
import com.greenfoxacademy.needforsequel.repositories.VideoGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
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

  @Override
  public void saveVideoGame(VideoGame videoGame) {
    videoGameRepository.save(videoGame);
  }

  @Override
  public List<VideoGame> filterVideoGamesByAgeAndIncome(String ageOption, int ageValue, String incomeOption, int incomeValue) {
    List<VideoGame> gamesFilteredByAge;
    List<VideoGame> gamesFiltereByAgeAndIncome;

    gamesFilteredByAge = filterGamesByAge(ageOption, ageValue);
    gamesFiltereByAgeAndIncome = filterGamesByIncome(incomeOption, incomeValue, gamesFilteredByAge);
    return gamesFiltereByAgeAndIncome;
  }


  public List<VideoGame> filterGamesByAge(String ageOption, int ageValue) {
    if (ageOption.equals("greater")) {
      return videoGameRepository.findAll().stream()
          .filter(videoGame -> videoGame.getAge() >= ageValue)
          .collect(Collectors.toList());
    }

    return videoGameRepository.findAll().stream()
        .filter(videoGame -> videoGame.getAge() < ageValue)
        .collect(Collectors.toList());
  }


  private List<VideoGame> filterGamesByIncome(String incomeOption, int incomeValue, List<VideoGame> filteredGames) {
    if (incomeOption.equals("greater")) {
      return filteredGames.stream()
          .filter(videoGame -> videoGame.getIncome() >= incomeValue)
          .collect(Collectors.toList());
    }

    return filteredGames.stream()
        .filter(videoGame -> videoGame.getIncome() < incomeValue)
        .collect(Collectors.toList());
  }

}
