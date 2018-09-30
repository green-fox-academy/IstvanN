package com.greenfoxacademy.tododatabasemysql.controllers;

import com.greenfoxacademy.tododatabasemysql.models.Todo;
import com.greenfoxacademy.tododatabasemysql.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/todo")
public class TodoController {

  private TodoService todoService;

  @Autowired
  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }

  @RequestMapping(value = {"", "/list"})
  public String list(@RequestParam(value = "isActive", required = false) boolean isActive, Model model) {
    if (isActive) {
      model.addAttribute("todos", todoService.getActiveTodos());
      return "todoslist";
    }

    model.addAttribute("todos", todoService.getAllTodos());
    return "todoslist";
  }

  @GetMapping("/add")
  public String showNewTodoForm(Model model) {
    model.addAttribute("todo", new Todo());
    return "add-todo";
  }

  @PostMapping("/add")
  public String addNewTodo(@ModelAttribute Todo todo) {
    todoService.saveNewTodo(todo);
    return "redirect:/todo/list";
  }

  @PostMapping(value = "/{id}/delete")
  public String deleteTodo(@PathVariable("id") long id) {
    todoService.deleteTodoById(id);
    return "redirect:/todo/list";
  }

  @GetMapping("/{id}/edit")
  public String showEditForm(@PathVariable("id") long id, Model model) {
    model.addAttribute("todo", todoService.getTodoById(id));
    return "edit-todo";
  }

  @PostMapping("/{id}/edit")
  public String editTodo(@ModelAttribute Todo todo) {
    todoService.saveNewTodo(todo);
    return "redirect:/todo/list";
  }

  @GetMapping("/{id}/show")
  public String showSingleTodo(@PathVariable("id") long id, Model model) {
    model.addAttribute("todo", todoService.getTodoById(id));
    return "show-single-todo";
  }
}


