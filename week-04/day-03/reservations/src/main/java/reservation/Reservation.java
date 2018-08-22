package main.java.reservation;

import java.util.Random;

public class Reservation implements Reservationy {
  String reservation;
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
    String[] listOfDays = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    int getRandom = random.nextInt(7);
    return listOfDays[getRandom];
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
