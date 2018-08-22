package main.java.reservation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Reservation implements Reservationy {
  String dowBooking;
  String codeBooking;
  List<String> listOfDays = new ArrayList<>(Arrays.asList("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"));
  Random random = new Random();

  public Reservation() {
    generateReservation();
  }

  private String generateReservation() {
    String reservation = "Booking# " + getCodeBooking() + " for " + getDowBooking();
    return reservation;
  }

  @Override
  public String getDowBooking() {
    int getRandom = random.nextInt(7);
    return listOfDays.get(getRandom);
  }

  @Override
  public String getCodeBooking() {
    return null;
  }
}
