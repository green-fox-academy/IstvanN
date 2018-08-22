package main.java.music;

public abstract class StringedInstrument extends Instrument {
  protected int numberOfStrings;

  public abstract String sound();

  public void play() {
    System.out.println(getName() + ", a " + getNumberOfStrings() + "-stringed intrument that goes " + sound());
  }

  public int getNumberOfStrings() {
    return numberOfStrings;
  }
}
