import java.util.ArrayList;
import java.util.List;

public class Sum {
  List<Integer> list;

  public Sum() {
    list = new ArrayList<>();
  }
  public int getSize() {
    return list.size();
  }

  public void addNumber(int number) {
    list.add(number);
  }

  public Integer getElement(int index) {
    return list.get(index);
  }
}
