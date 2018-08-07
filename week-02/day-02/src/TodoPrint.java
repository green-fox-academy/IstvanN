public class TodoPrint {
  public static void main(String[] args) {

    String todoText = " - Buy milk\n";
    String titleToDo = "My todo:\n";
    String games = " - Download games\n";
    String diabloIsLoveDiabloIsLife = "\t - Diablo";

    todoText = titleToDo + todoText + games + diabloIsLoveDiabloIsLife;
    System.out.println(todoText);
  }
}
