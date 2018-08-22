import java.util.stream.IntStream;

public class Gnirts implements CharSequence {
  String string;

  public Gnirts(String string) {
    this.string = reverse(string);
  }

  public String reverse(String input) {
    String reverseString = "";
    for (int i = input.length() - 1; i >= 0; i--) {
      reverseString += input.charAt(i);
    }
    return reverseString;
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

  public int length() {
    return string.length();
  }

  public String toString() {
    return string.toString();
  }
}
