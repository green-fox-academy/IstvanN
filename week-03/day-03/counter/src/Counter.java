public class Counter {
  private int value;
  private int initialValue;
  private boolean ifInitialWasUsed;

  public Counter() {
    value = 0;
    ifInitialWasUsed = false;
  }

  public Counter(int initialValue) {
    value = initialValue;
    ifInitialWasUsed = true;
    this.initialValue = initialValue;
  }

  public int add() {
    value++;
    return value;
  }

  public int add(int number) {
    value += number;
    return value;
  }

  public int get() {
    return value;
  }

  public int reset() {
    if (ifInitialWasUsed) {
      return initialValue;
    } else {
      return 0;
    }
  }
}
