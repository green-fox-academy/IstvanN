package com.greenfoxacademy.tododatabasemysql.services;

import com.greenfoxacademy.tododatabasemysql.models.Todo;

import java.util.List;

public interface TodoService {

  List<Todo> getAllTodos();
  List<Todo> getActiveTodos();
  Todo getTodoById(long id);
  void saveNewTodo(Todo todo);
  void deleteTodoById(long id);
  List<Todo> getTodosContaining(String searchOption);
}
