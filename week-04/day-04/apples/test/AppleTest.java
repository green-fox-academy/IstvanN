import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {
  Apple apple;

  @Before
  public void before() {
    apple = new Apple();
  }

  @Test
  public void getAppleShouldReturnMyString() {
    Assert.assertEquals("apple", apple.getApple());
  }

  @Test
  public void getAppleReturnsName() {
    Assert.assertEquals(apple.getApple(), apple.name);
  }

}