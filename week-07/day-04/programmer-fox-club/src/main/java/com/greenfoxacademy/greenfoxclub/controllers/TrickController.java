package com.greenfoxacademy.greenfoxclub.controllers;

import com.greenfoxacademy.greenfoxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Arrays;
import java.util.List;

@Controller
public class TrickController {

  private List<String> tricks = Arrays.asList("football", "squash", "bassguitar");

  @Autowired
  FoxService foxService;
}
