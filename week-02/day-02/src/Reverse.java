public class Reverse {
  public static void main(String[] args) {
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    reversePhrase(reversed);
  }

  // This function takes in a phrase and prints out its reverse
  public static void reversePhrase(String phraseToBeReversed) {
    String reverse = "";

    for (int i = phraseToBeReversed.length() - 1; i >= 0; i--) {
      reverse = reverse + phraseToBeReversed.charAt(i);
    }

    System.out.println(reverse);
  }
}
