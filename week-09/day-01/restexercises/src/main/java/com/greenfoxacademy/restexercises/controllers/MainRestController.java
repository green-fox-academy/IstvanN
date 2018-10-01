package com.greenfoxacademy.restexercises.controllers;

import com.greenfoxacademy.restexercises.models.AAppender;
import com.greenfoxacademy.restexercises.models.Doubling;
import com.greenfoxacademy.restexercises.models.ErrorHandler;
import com.greenfoxacademy.restexercises.models.Greeter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

  @GetMapping("/doubling")
  public Object doubleTheInput(@RequestParam(value = "input", required = false) Integer input) {
    if (input == null) {
      ErrorHandler errorHandler = new ErrorHandler();
      errorHandler.setError("Please provide an input!");
      return errorHandler;
    }

    Doubling doubling = new Doubling();
    doubling.setReceived(input);
    doubling.doubleRecieved();
    return doubling;
  }

  @GetMapping("/greeter")
  public Object greet(@RequestParam(value = "name", required = false) String name,
                      @RequestParam(value = "title", required = false) String title) {
    if (name == null) {
      ErrorHandler errorHandler = new ErrorHandler();
      errorHandler.setError("Please provide a name!");
      return errorHandler;
    }

    if (title == null) {
      ErrorHandler errorHandler = new ErrorHandler();
      errorHandler.setError("Please provide a title!");
      return errorHandler;
    }

    Greeter greeter = new Greeter();
    greeter.greet(name, title);
    return greeter;
  }

  @GetMapping("/appenda/{appendable}")
  public AAppender appendA(@PathVariable("appendable") String appendable) {
    AAppender aAppender = new AAppender();
    aAppender.appendA(appendable);
    return aAppender;
  }
}
