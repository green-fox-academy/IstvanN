package com.greenfoxacademy.foxclubwithsql.services;

import com.greenfoxacademy.foxclubwithsql.models.Manatee;
import com.greenfoxacademy.foxclubwithsql.models.User;

public interface UserService {

  User getUserById(long id);
  void saveUser(User user);
  User getUserByUserName(String username);
  void addManateeToUser(long userId, Manatee manatee);
}
