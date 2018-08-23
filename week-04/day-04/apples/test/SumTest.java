import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {
  Sum l;

  @Before
  public void before() {
    l = new Sum();
  }

  @Test
  public void createEmptyList() {
    Assert.assertEquals(0, l.getSize());
  }
}