import java.util.Arrays;

public class Anagram {
  public static void main(String[] args) {

//    Trying out the function to see if it works
    System.out.println(isAnagram("doggy", "gygod"));
    System.out.println(isAnagram("green", "fox"));

  }

//  This function takes two string and return boolean whether they are anagrams or not

  public static boolean isAnagram(String wordOne, String wordTwo) {

//    Making character array of the inputs
    char[] arrayOne = wordOne.toCharArray();
    char[] arrayTwo = wordTwo.toCharArray();

//    Sorting them
    Arrays.sort(arrayOne);
    Arrays.sort(arrayTwo);

//    Transforming them back to strings
    String wordOneSorted = new String(arrayOne);
    String wordTwoSorted = new String(arrayTwo);

//    Comparing the two now-sorted words

    if (wordOneSorted.equals(wordTwoSorted)) {
      return true;
    } else {
      return false;
    }
  }
}
