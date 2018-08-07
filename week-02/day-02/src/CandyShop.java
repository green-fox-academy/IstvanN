import java.util.ArrayList;

public class CandyShop {
  public static void main(String[] args) {
    ArrayList<Object> arrayList = new ArrayList<Object>();

    arrayList.add("Cupcake");
    arrayList.add(2);
    arrayList.add("Brownie");
    arrayList.add(false);

    System.out.println(sweets(arrayList));
  }

  //  This function will replace 2 and false with sweeties
  public static ArrayList<Object> sweets(ArrayList<Object> listToBeSweeten) {

    ArrayList finalList = new ArrayList();

    for (int i = 0; i < listToBeSweeten.size(); i++) {
      if (listToBeSweeten.get(i).equals(2)) {
        finalList.add("Croissant");
      } else if (listToBeSweeten.get(i).equals(false)) {
        finalList.add("Ice cream");
      } else {
        finalList.add(listToBeSweeten.get(i));
      }
    }

    return finalList;
  }
}
