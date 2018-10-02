package com.greenfoxacademy.foxclubwithsql.services;

import com.greenfoxacademy.foxclubwithsql.models.Manatee;

public interface ManateeService {
  void saveManatee(Manatee manatee);
  Manatee getManateeById(long id);
  void removeManateeById(long id);
}
