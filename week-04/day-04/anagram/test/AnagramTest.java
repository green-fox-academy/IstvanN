import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.*;

public class AnagramTest {
  Anagram a;

  @Before
  public void before() {
    a = new Anagram();
  }

  @Test
  public void testCastWordMethod() {
    char[] listOfChars = a.castWordIntoListOfChars("bok");
    Assert.assertEquals('b', listOfChars[0]);
  }
}