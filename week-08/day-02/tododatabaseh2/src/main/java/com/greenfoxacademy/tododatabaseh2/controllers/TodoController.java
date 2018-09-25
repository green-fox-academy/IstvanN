package com.greenfoxacademy.tododatabaseh2.controllers;

import com.greenfoxacademy.tododatabaseh2.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @GetMapping(value = {"", "/list"})
  public String list(Model model) {
    model.addAttribute("todos",todoRepository.findAll());
    return "todoslist";
  }
}
