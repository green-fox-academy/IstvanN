import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {


  @Test
  public void testIfStringLengthsAreNotEqual() {
    assertEquals(false, Anagram.checkAnagram("doggo", "caty"));
  }

  @Test
  public void testReturnFalseWhenWordsAreTheSame() {
    assertEquals(false, Anagram.checkAnagram("doggo", "doggo"));
  }

  @Test
  public void returnTrueIfAnagrams() {
    assertEquals(true, Anagram.checkAnagram("doggo", "oggod"));
  }

  @Test
  public void returnTrueIfDifferentLetterCases() {
    assertEquals(true, Anagram.checkAnagram("cat", "Tca"));
  }

  @Test
  public void checkIfWordsHaveSpaces() {
    assertEquals(false, Anagram.checkAnagram("g od", " dog"));
  }
}