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
    videoGameService.saveVideoGame(new VideoGame("The Witcher 3: Wild Hunt", "CD Projekt Red", 200, 3, 20));
    videoGameService.saveVideoGame(new VideoGame("FIFA 99", "EA Sports", 50, 19, 5));
    videoGameService.saveVideoGame(new VideoGame("Neverwinter Nights", "BioWare", 10, 17, 1));
    videoGameService.saveVideoGame(new VideoGame("GTA 5", "Rockstar Games", 300, 4, 50));
  }
}
