import java.util.stream.IntStream;

public class Shifter implements CharSequence {
  String string;
  int howManyToShift;

  public Shifter(String string, int howManyToShift) {
    this.string = shifting(string, howManyToShift);
  }

  public String shifting(String string, int howManyToShift) {
    String stringShifted = "";
    String chunkToEnd = string.substring(0, howManyToShift);
    String chunkToBeginning = string.substring(howManyToShift);
    stringShifted = chunkToBeginning + chunkToEnd;
    return stringShifted;
  }

  @Override
  public int length() {
    return string.length();
  }

  @Override
  public char charAt(int index) {
    return string.charAt(index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return string.subSequence(start, end);
  }

  @Override
  public IntStream chars() {
    return null;
  }

  @Override
  public IntStream codePoints() {
    return null;
  }
}
