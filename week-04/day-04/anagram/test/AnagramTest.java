import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class AnagramTest {
  Anagram a;

  @Before
  public void before() {
    a = new Anagram();
  }

  @Test
  public void testCastWordMethod() {
    String[] listOfChars = a.castWordIntoListOfArray("bok");
    Assert.assertEquals("b", listOfChars[0]);
    Assert.assertEquals("o", listOfChars[1]);
    Assert.assertEquals("k", listOfChars[2]);
  }

  @Test
  public void testIfAnagramMethodFalse() {
    Assert.assertFalse(a.ifAnagram("ugugugu", "ugugug"));
  }
}