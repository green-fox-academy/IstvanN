package com.greenfoxacademy.tododatabasemysql.services;

import com.greenfoxacademy.tododatabasemysql.models.Todo;
import com.greenfoxacademy.tododatabasemysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {


  private TodoRepository todoRepository;

  @Autowired
  public TodoServiceImpl(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @Override
  public List<Todo> getAllTodos() {
    return null;
  }

  @Override
  public Todo getTodoById(long id) {
    return null;
  }
}
