package main.java.music;

public class BassGuitar extends StringedInstrument {
  public BassGuitar() {
    name = "Bass Guitar";
    numberOfStrings = 4;
  }

  @Override
  public String sound() {
    return "Duum-duum-duum";
  }
}
