import java.util.Arrays;

public class Bubble {
  public static void main(String[] args) {
    int[] newArray = {34, 12, 24, 9, 5};
    bubbleAdvanced(newArray, true);

    for (int element : newArray) {
      System.out.println(element);
    }
  }

  //  This method makes the list of numbers in ascending order
  public static int[] bubble(int[] listToBeSorted) {
    Arrays.sort(listToBeSorted);
    return listToBeSorted;
  }

  //  This method makes the list if number in descending order, if the 'ifTrue' is true, otherwise it makes it ascending
  public static int[] bubbleAdvanced(int[] listToBeSorted, boolean ifTrue) {

    if (ifTrue) {
      Arrays.sort(listToBeSorted);
      int[] temporaryList = new int[listToBeSorted.length];
      int j = 0;
      for (int i = listToBeSorted.length - 1; i >= 0; i--) {
        temporaryList[j] = listToBeSorted[i];
        j++;
      }

      for (int i = 0; i < temporaryList.length; i++) {
        listToBeSorted[i] = temporaryList[i];
      }
    } else {
      Arrays.sort(listToBeSorted);
    }

    return listToBeSorted;
  }
}
