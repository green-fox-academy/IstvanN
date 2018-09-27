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
    VideoGame v1 = new VideoGame("The Witcher 3: Wild Hunt", "CD Projekt Red", 20000000, 3);
    VideoGame v2 = new VideoGame("FIFA 99", "EA Sports", 500000, 19);

    videoGameService.saveVideoGame(v1);
    videoGameService.saveVideoGame(v2);
  }
}
