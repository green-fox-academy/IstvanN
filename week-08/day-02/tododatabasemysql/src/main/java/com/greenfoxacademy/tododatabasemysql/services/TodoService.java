package com.greenfoxacademy.tododatabasemysql.services;

import com.greenfoxacademy.tododatabasemysql.models.Todo;

import java.util.List;

public interface TodoService {

  List<Todo> getAllTodos();
  Todo getTodoById(long id);
}
