package main.java.music;

public class Violin extends StringedInstrument {
  public Violin() {
    name = "Violin";
    numberOfStrings = 4;
  }

  @Override
  public String sound() {
    return "Screech";
  }
}
