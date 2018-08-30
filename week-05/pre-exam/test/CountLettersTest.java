import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CountLettersTest {
  CountLetters cl;
  String s;

  @Before
  public void before() {
    cl = new CountLetters();
  }

  @Test
  public void testCountLettersMethod() {
    s = "lol";
    Assert.assertEquals(2, cl.countLetters(s).get('l'), 0);
  }

  @Test
  public void testCountLettersMethodWithAnotherWord() {
    s = "llllk";
    Assert.assertEquals(4, cl.countLetters(s).get('l'), 0);
  }
}