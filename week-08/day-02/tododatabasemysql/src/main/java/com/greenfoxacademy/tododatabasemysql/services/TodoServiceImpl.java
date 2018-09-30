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
    return todoRepository.findAll();
  }

  @Override
  public List<Todo> getActiveTodos() {
    return todoRepository.findAllByDoneFalse();
  }

  @Override
  public Todo getTodoById(long id) {
    return todoRepository.findById(id).orElse(null);
  }

  @Override
  public void saveNewTodo(Todo todo) {
    todoRepository.save(todo);
  }

  @Override
  public void deleteTodoById(long todoId) {
    todoRepository.deleteById(todoId);
  }

  @Override
  public List<Todo> getTodosContaining(String searchOption) {
    return todoRepository.findAllByTitleContaining(searchOption);
  }
}
