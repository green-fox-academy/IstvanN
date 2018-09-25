package com.greenfoxacademy.tododatabasemysql.controllers;

import com.greenfoxacademy.tododatabasemysql.models.Todo;
import com.greenfoxacademy.tododatabasemysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

  @GetMapping("/add")
  public String showNewTodoForm(Model model) {
    model.addAttribute("todo", new Todo());
    return "add-todo";
  }

  @PostMapping("/add")
  public String addNewTodo(@ModelAttribute Todo todo) {
    todoRepository.save(todo);
    return "redirect:/todo/list";
  }

  @PostMapping(value = "/{id}/delete")
  public String deleteTodo(@PathVariable("id") long id) {
    todoRepository.deleteById(id);
    return "redirect:/todo/list";
  }

  @GetMapping("/{id}/edit")
  public String showEditForm(@PathVariable("id") long id, Model model) {
    model.addAttribute("todo", todoRepository.findById(id).get());
    return "edit-todo";
  }

  @PostMapping("/{id}/edit")
  public String editTodo(@ModelAttribute Todo todo) {
    todoRepository.save(todo);
    return "redirect:/todo/list";
  }
}


