import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FruitTest {
  Fruit apple;
  Fruit banana;
  Fruit peach;
  List<Fruit> fruits;

  @Before
  public void before() {
    apple = new Fruit("Apple", 3);
    banana = new Fruit("Banana", 1);
    peach = new Fruit("Peach", 2);
    fruits = new ArrayList<>();
    fruits.add(apple);
    fruits.add(banana);
    fruits.add(peach);
  }

  @Test
  public void testBeforeSort() {
    Assert.assertEquals("Apple", fruits.get(0).getName());
  }

  @Test
  public void testComparable() {
    Collections.sort(fruits);
    Assert.assertEquals("Banana", fruits.get(0).getName());
  }
}
