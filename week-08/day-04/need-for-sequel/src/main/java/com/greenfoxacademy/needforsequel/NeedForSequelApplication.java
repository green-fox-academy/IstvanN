package com.greenfoxacademy.needforsequel;

import com.greenfoxacademy.needforsequel.models.VideoGame;
import com.greenfoxacademy.needforsequel.services.VideoGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NeedForSequelApplication implements CommandLineRunner {

  @Autowired
  VideoGameService videoGameService;

  public static void main(String[] args) {
    SpringApplication.run(NeedForSequelApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    videoGameService.saveVideoGame(new VideoGame("The Witcher 3: Wild Hunt", "CD Projekt Red", 211, 3, 87));
    videoGameService.saveVideoGame(new VideoGame("FIFA 99", "EA Sports", 56, 19, 5));
    videoGameService.saveVideoGame(new VideoGame("Neverwinter Nights", "BioWare", 12, 17, 1));
    videoGameService.saveVideoGame(new VideoGame("GTA 5", "Rockstar Games", 315, 5, 125));
    videoGameService.saveVideoGame(new VideoGame("The Sims", "Maxis", 128, 18, 64));
    videoGameService.saveVideoGame(new VideoGame("Heroes of Might And Magic III", "3DO", 48, 18, 19));
    videoGameService.saveVideoGame(new VideoGame("Heroes of Might And Magic IV", "3DO", 34, 16, 4));
    videoGameService.saveVideoGame(new VideoGame("Dragon Age: Origins", "BioWare", 57, 9, 34));
  }
}
