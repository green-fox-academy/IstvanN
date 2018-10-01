package com.greenfoxacademy.restexercises.controllers;

import com.greenfoxacademy.restexercises.models.Doubling;
import com.greenfoxacademy.restexercises.models.ErrorHandler;
import org.springframework.web.bind.annotation.GetMapping;
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

//  @GetMapping("/greeter")
//  public Object greet(@RequestParam(value = "name", required = false) String name,
//                      @RequestParam(value = "title", required = false) String title) {
//
//  }
}
