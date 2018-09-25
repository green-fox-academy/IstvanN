package com.greenfoxacademy.tododatabasemysql.repositories;

import com.greenfoxacademy.tododatabasemysql.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
