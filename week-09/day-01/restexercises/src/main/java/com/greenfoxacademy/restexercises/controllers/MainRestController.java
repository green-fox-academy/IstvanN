package com.greenfoxacademy.restexercises.controllers;

import com.greenfoxacademy.restexercises.models.frontend.*;
import org.springframework.web.bind.annotation.*;

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

  @PostMapping("/dountil/{action}")
  public Object doUntil(@RequestBody(required = false) Until until, @PathVariable("action") String action) {
    DoUntil doUntil = new DoUntil();

    if (until != null) {
      if (action.equals("sum")) {
        doUntil.sum(until);
        return doUntil;
      }

      doUntil.fact(until);
      return doUntil;
    }

    ErrorHandler errorHandler = new ErrorHandler();
    errorHandler.setError("Please provide a number!");
    return errorHandler;
  }
}
