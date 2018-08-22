package main.java.music;

public class ElectricGuitar extends StringedInstrument {
  public ElectricGuitar() {
    name = "Electric Guitar";
    numberOfStrings = 6;
  }

  @Override
  public String sound() {
    return "Twang";
  }
}
