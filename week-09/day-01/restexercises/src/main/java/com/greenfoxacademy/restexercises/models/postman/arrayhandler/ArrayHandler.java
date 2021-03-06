package com.greenfoxacademy.restexercises.models.postman.arrayhandler;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ArrayHandler {

  private int result;

  public void handleWhatNumber(WhatNumbers whatNumbers) {
    if (whatNumbers.getWhat().equals("sum")) {
      sumNumbersInArray(whatNumbers.getNumbers());
    } else if (whatNumbers.getWhat().equals("multiply")) {
      multiplyNumbersInArray(whatNumbers.getNumbers());
    }
  }

  private void multiplyNumbersInArray(Integer[] numbers) {
    result = 1;
    for (int number : numbers) {
      result *= number;
    }
  }

  private void sumNumbersInArray(Integer[] numbers) {
    result = 0;
    for (int number : numbers) {
      result += number;
    }
  }

//  private void doubleElementsInArray(Integer[] numbers) {
//    for (int i = 0; i < numbers.length; i++) {
//      numbers[i] *= 2;
//    }
//
//    Integer.
//  }
}
