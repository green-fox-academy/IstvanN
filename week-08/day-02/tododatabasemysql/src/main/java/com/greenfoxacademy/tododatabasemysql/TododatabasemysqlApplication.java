package com.greenfoxacademy.tododatabasemysql;

import com.greenfoxacademy.tododatabasemysql.models.Todo;
import com.greenfoxacademy.tododatabasemysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class TododatabasemysqlApplication implements CommandLineRunner {

  @Autowired
  TodoRepository todoRepository;

  public static void main(String[] args) {
    SpringApplication.run(TododatabasemysqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    Todo todo1 = new Todo("I have to learn to use DBs");
    todoRepository.save(todo1);
    Todo todo2 = new Todo("I have to play some Sword Coast Legends");
    todoRepository.save(todo2);
    todoRepository.saveAll(Arrays.asList(new Todo("Lol"), new Todo("Lel")));
  }
}
