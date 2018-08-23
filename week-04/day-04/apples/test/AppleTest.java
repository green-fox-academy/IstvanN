import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

  @Test
  public void getAppleShouldReturnMyString() {
    Apple apple = new Apple();
    Assert.assertEquals("apple", apple.getApple());
  }

}