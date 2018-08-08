import java.util.Arrays;

public class Bubble {
  public static void main(String[] args) {
    int[] newArray = {34, 12, 24, 9, 5};
    bubbleAdvanced(newArray);

    for (int element : newArray) {
      System.out.println(element);
    }
  }

  public static int[] bubble(int[] listToBeSorted) {
    Arrays.sort(listToBeSorted);
    return listToBeSorted;
  }

  public static int[] bubbleAdvanced(int[] listToBeSorted) {
    int[] temporaryList = new int[listToBeSorted.length];
    Arrays.sort(listToBeSorted);


    int j = 0;
    for (int i = listToBeSorted.length - 1; i >= 0; i--) {
      temporaryList[j] = listToBeSorted[i];
      j++;
    }

    for (int i = 0; i < temporaryList.length; i++) {
      listToBeSorted[i] = temporaryList[i];
    }

    return listToBeSorted;
  }
}
