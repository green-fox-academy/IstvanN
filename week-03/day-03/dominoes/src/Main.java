import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    
    List<Domino> sortedDominoes = new ArrayList<>();
    sortedDominoes.add(dominoes.get(0));

    int counter = 0;
    while (sortedDominoes.size() != dominoes.size()) {
      for (int i = 1; i < dominoes.size(); i++) {
        if (sortedDominoes.get(counter).getValues()[1] == dominoes.get(i).getValues()[0]) {
          sortedDominoes.add(dominoes.get(i));
          counter++;
        }
      }
    }

    System.out.println(sortedDominoes);
  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
}
