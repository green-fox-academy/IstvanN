package main.java.music;

public class ElectricGuitar extends StringedInstrument {
  public ElectricGuitar() {
    name = "Electric Guitar";
    numberOfStrings = 6;
  }

  public ElectricGuitar(int numberOfStrings) {
    name = "Electric Guitar";
    this.numberOfStrings = numberOfStrings;
  }

  @Override
  public String sound() {
    if (numberOfStrings == 6) {
      return "Twang";
    } else {
      return "Twangg";
    }
  }
}
