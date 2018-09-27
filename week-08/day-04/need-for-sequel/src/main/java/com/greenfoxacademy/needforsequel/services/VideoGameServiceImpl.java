package com.greenfoxacademy.needforsequel.services;

import com.greenfoxacademy.needforsequel.models.VideoGame;
import com.greenfoxacademy.needforsequel.repositories.VideoGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
  public List<VideoGame> filterVideoGamesByAgeAndIncome(String ageOption, Integer ageValue, String incomeOption, Integer incomeValue) {
    List<VideoGame> startingPoint = videoGameRepository.findAll();
    List<VideoGame> firsFilteredGames;
    List<VideoGame> secondFilteredGames = new ArrayList<>();

    if (ageOption != null) {
      firsFilteredGames = filterGamesByAge(ageOption, ageValue, startingPoint);
    } else {
      firsFilteredGames = startingPoint;
    }

    if (incomeOption != null) {
      secondFilteredGames = filterGamesByIncome(incomeOption, incomeValue, firsFilteredGames);
    } else {
      secondFilteredGames.addAll(firsFilteredGames);
    }

    return secondFilteredGames;
  }


  public List<VideoGame> filterGamesByAge(String ageOption, int ageValue, List<VideoGame> filteredGames) {
    if (ageOption.equals("greater")) {
      return filteredGames.stream()
          .filter(videoGame -> videoGame.getAge() >= ageValue)
          .collect(Collectors.toList());
    }

    return filteredGames.stream()
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
