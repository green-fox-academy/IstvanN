package com.greenfoxacademy.tododatabasemysql.repositories;

import com.greenfoxacademy.tododatabasemysql.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
