import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;


public class AnagramTest {
  Anagram a;

  @Before
  public void before() {
    a = new Anagram();
  }

  @Test
  public void testCastWordMethod() {
    List<String> list = a.castWordIntoListOfArray("bok");
    Assert.assertEquals("b", list.get(0));
    Assert.assertEquals("k", list.get(1));
    Assert.assertEquals("o", list.get(2));
  }

  @Test
  public void testIfAnagramMethodFalse() {
    Assert.assertFalse(a.ifAnagram("ugugugu", "ugugug"));
  }

  @Test
  public void testIfAnagramMethodTrue() {
    Assert.assertTrue(a.ifAnagram("funeral", "realfun"));
  }

  @Test
  public void testAnagramMethodWithSpaces() {
    Assert.assertTrue(a.ifAnagram("funeral", "real fun"));
  }
}