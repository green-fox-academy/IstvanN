package com.greenfoxacademy.foxclubwithsql.services;

import com.greenfoxacademy.foxclubwithsql.models.Manatee;
import com.greenfoxacademy.foxclubwithsql.models.User;
import com.greenfoxacademy.foxclubwithsql.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;

  @Autowired
  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public User getUserById(long id) {
    return userRepository.findById(id).orElse(null);
  }

  @Override
  public User createUser() {
    return new User();
  }

  @Override
  public void saveUser(User user) {
    userRepository.save(user);
  }

  @Override
  public User getUserByUserName(String username) {
    return userRepository.findByUsername(username);
  }

  @Override
  public void createManateeAddToUser(long userId, String manateeName) {
    Manatee manatee = new Manatee(manateeName);
    User user = userRepository.findById(userId).orElse(null);
    user.addManatee(manatee);
    userRepository.save(user);
  }
}
