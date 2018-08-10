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

  //  This method makes the array of numbers in descending order,
  //  if the 'ifTrue' is true, otherwise it makes it ascending
  public static int[] bubbleAdvanced(int[] arrayToBeSorted, boolean ifTrue) {

    Arrays.sort(arrayToBeSorted);


    if (ifTrue) {
      int[] temporaryList = new int[arrayToBeSorted.length];

//      Looping through the list to be sorted from backwards
      int j = 0;
      for (int i = arrayToBeSorted.length - 1; i >= 0; i--) {
        temporaryList[j] = arrayToBeSorted[i];
        j++;
      }

      for (int i = 0; i < temporaryList.length; i++) {
        arrayToBeSorted[i] = temporaryList[i];
      }
    }

    return arrayToBeSorted;
  }
}
