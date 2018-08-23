import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
  Anagram a;

  @Before
  public void before() {
    a = new Anagram();
  }

  @Test
  public void testIfAnagramMethod() {
    Assert.assertTrue(a.ifAnagram("dog", "god"));
  }

  @Test
  public void shouldReturnFalse() {
    Assert.assertFalse(a.ifAnagram("asd", "wasd"));
  }
}