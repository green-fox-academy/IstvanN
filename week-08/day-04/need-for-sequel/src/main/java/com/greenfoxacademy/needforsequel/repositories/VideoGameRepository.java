package com.greenfoxacademy.needforsequel.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoGameRepository extends CrudRepository<VideoGameRepository, Integer> {
}
