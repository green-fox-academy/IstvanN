import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumTest {
  Sum sum;

  @Before
  public void before() {
    sum = new Sum();
  }

  @Test
  public void createEmptyList() {
    Assert.assertEquals(0, sum.getSize());
  }

  @Test
  public void getElementTestAndAddNumberTest() {
    sum.addNumber(5);
    Assert.assertEquals(5, sum.getElement(0));
  }

  @Test
  public void testSumMethod() {
    List list = new ArrayList(Arrays.asList(5, 10, 15));
    sum.sumAll(list);
    Assert.assertEquals(30, sum.sumAll(list));
  }

  @Test
  public void testSumWithEmptyList() {
    List list = new ArrayList();
    sum.sumAll(list);
    Assert.assertEquals(0, sum.sumAll(list));
  }

  @Test
  public void testSumWithOneElement() {
    List list = new ArrayList(Arrays.asList(1));
    sum.sumAll(list);
    Assert.assertEquals(1, sum.sumAll(list));
  }

}