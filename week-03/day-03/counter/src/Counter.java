public class Counter {
  int initialValue;
  int value;

  public Counter() {
    initialValue = 0;
  }

  public Counter(int initialValue) {
    this.initialValue = initialValue;
  }

  public int add() {
    value = initialValue + 1;
    return value;
  }

  public int add(int number) {
    value = number + initialValue;
    return value;
  }

  public int get() {
    return value;
  }

  public int reset() {
    value = initialValue;
    return value;
  }
}
