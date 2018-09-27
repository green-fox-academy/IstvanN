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
  public List<VideoGame> filterVideoGamesByAgeIncomeSoldCopy(
      String ageOption, int ageValue,
      String incomeOption, int incomeValue,
      String copyOption, int copyValue) {
    List<VideoGame> startingPoint = videoGameRepository.findAll();
    List<VideoGame> firsFilteredGames = filterGamesByAge(
        ageOption, ageValue, startingPoint);
    List<VideoGame> secondFilteredGames = filterGamesByIncome(
        incomeOption, incomeValue, firsFilteredGames);
    List<VideoGame> lastFilteredGames = filterGamesByCopy(
        copyOption, copyValue, secondFilteredGames);

    return lastFilteredGames;
  }


  private List<VideoGame> filterGamesByAge(
      String ageOption,
      int ageValue,
      List<VideoGame> listToFilter) {
    if (ageOption.equals("greater")) {
      return listToFilter.stream()
          .filter(videoGame -> videoGame.getAge() >= ageValue)
          .collect(Collectors.toList());
    }

    return listToFilter.stream()
        .filter(videoGame -> videoGame.getAge() < ageValue)
        .collect(Collectors.toList());
  }


  private List<VideoGame> filterGamesByIncome(String incomeOption, int incomeValue, List<VideoGame> listToFilter) {
    if (incomeOption.equals("greater")) {
      return listToFilter.stream()
          .filter(videoGame -> videoGame.getIncome() >= incomeValue)
          .collect(Collectors.toList());
    }

    return listToFilter.stream()
        .filter(videoGame -> videoGame.getIncome() < incomeValue)
        .collect(Collectors.toList());
  }


  private List<VideoGame> filterGamesByCopy(String copyOption, int copyValue, List<VideoGame> listToFilter) {
    if (copyOption.equals("greater")) {
      return listToFilter.stream()
          .filter(videoGame -> videoGame.getSoldCopy() >= copyValue)
          .collect(Collectors.toList());
    }

    return listToFilter.stream()
        .filter(videoGame -> videoGame.getSoldCopy() < copyValue)
        .collect(Collectors.toList());
  }
}
