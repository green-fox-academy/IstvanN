public class PalindromeBuilder {
  public static void main(String[] args) {

    System.out.println(palindromeBuilder("greenfox"));
  }

  //  The palindrome builder function
  public static String palindromeBuilder(String phraseToBePalindromed) {

//    Creating the reverse of the input word
    String reverse = "";

    for (int i = phraseToBePalindromed.length() - 1; i >= 0; i--) {
     reverse += phraseToBePalindromed.charAt(i);
    }

    String braveNewWord = phraseToBePalindromed + reverse;
    return braveNewWord;
  }
}
