package com.greenfoxacademy.restexercises.controllers;

import com.greenfoxacademy.restexercises.models.frontend.ErrorHandler;
import com.greenfoxacademy.restexercises.models.postman.arrayhandler.ArrayHandler;
import com.greenfoxacademy.restexercises.models.postman.arrayhandler.WhatNumbers;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostmanRestController {

  @PostMapping("/arrays")
  public Object handleArray(@RequestBody(required = false) WhatNumbers whatNumbers) {
    if (whatNumbers.getWhat() == null || whatNumbers.getNumbers() == null) {
      ErrorHandler errorHandler = new ErrorHandler();
      errorHandler.setError("Please provide what to do with numbers");
      return errorHandler;
    }

    ArrayHandler arrayHandler = new ArrayHandler();
    arrayHandler.handleWhatNumber(whatNumbers);
    return arrayHandler;
  }
}
