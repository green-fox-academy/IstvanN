package com.greenfoxacademy.tododatabaseh2.repositories;

import com.greenfoxacademy.tododatabaseh2.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
