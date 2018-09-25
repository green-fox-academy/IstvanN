package com.greenfoxacademy.tododatabasemysql.controllers;

import com.greenfoxacademy.tododatabasemysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.stream.StreamSupport;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @RequestMapping(value = {"", "/list"})
  public String list(@RequestParam(value = "isActive", required = false) boolean isActive, Model model) {
    if (isActive) {
      model.addAttribute("todos", StreamSupport.stream(todoRepository.findAll().spliterator(), false)
          .filter(todo -> !todo.isDone())
          .toArray());
      return "todoslist";
    }

    model.addAttribute("todos", todoRepository.findAll());
    return "todoslist";
  }

  @GetMapping("add")
  public String addNewTodo() {
    return "add-todo";
  }
}
