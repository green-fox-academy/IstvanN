package com.greenfoxacademy.tododatabasemysql.repositories;

import com.greenfoxacademy.tododatabasemysql.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

  List<Todo> findAllByDoneFalse();

  List<Todo> findAll();
  List<Todo> findAllByTitleContaining(String searchOption);
}
