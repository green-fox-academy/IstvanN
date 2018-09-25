package com.greenfoxacademy.tododatabasemysql;

import com.greenfoxacademy.tododatabasemysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class TododatabasemysqlApplication {

  @Autowired
  TodoRepository todoRepository;

  public static void main(String[] args) {
    SpringApplication.run(TododatabasemysqlApplication.class, args);
  }

}
