package main.java.reservation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Reservation implements Reservationy {
  String reservation;
  List<String> listOfDays = new ArrayList<>(Arrays.asList("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"));
  Random random = new Random();

  public Reservation() {
    reservation = generateReservation();
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
    String code = "";
    String charsAvailable = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    while (code.length() < 8) {
      int getRandom = random.nextInt(36);
      code += charsAvailable.charAt(getRandom);
    }

    return code;
  }

  public String getReservation() {
    return reservation;
  }
}
