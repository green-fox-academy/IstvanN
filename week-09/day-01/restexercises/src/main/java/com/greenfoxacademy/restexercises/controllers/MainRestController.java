package com.greenfoxacademy.restexercises.controllers;

import com.greenfoxacademy.restexercises.models.Doubling;
import com.greenfoxacademy.restexercises.models.DoublingError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

  @GetMapping("/doubling")
  public Object doubleTheInput(@RequestParam(value = "input", required = false) Integer input) {
    if (input != null) {
      Doubling doubling = new Doubling();
      doubling.setReceived(input);
      doubling.doubleRecieved();
      return doubling;
    }

    DoublingError doublingError = new DoublingError();
    doublingError.setError("Please provide an input!");
    return doublingError;
  }
}
