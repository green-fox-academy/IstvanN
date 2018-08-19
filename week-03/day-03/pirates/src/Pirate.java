import java.util.Random;

public class Pirate {
  int rumLevel;
  boolean alive;
  boolean passedOut;

  public Pirate() {
    rumLevel = 0;
    alive = true;
    passedOut = false;
  }

  public int drinkSomeRum() {
    if (alive) {
      rumLevel++;
      System.out.println("Yaharr!");
    } else {
      rumLevel = 0;
      System.out.println("This guy's dead.");
    }
    return rumLevel;
  }

  public boolean howsItGoingMate() {
    if (alive) {
      if (rumLevel < 5) {
        System.out.println("Pour me anudder!");
        passedOut = false;
      } else {
        System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        passedOut = true;
      }
    } else {
      passedOut = false;
      System.out.println("This guy's dead.");
    }
    return passedOut;
  }

  public boolean die() {
    return alive = false;
  }

  public boolean brawl(Pirate pirate) {
    if (alive) {
      if (pirate.alive) {
        Random random = new Random();
        int brawRoll = random.nextInt(3);
        if (brawRoll == 0) {
          alive = false;
        } else if (brawRoll == 1) {
          pirate.alive = false;
        } else {
          passedOut = true;
          pirate.passedOut = true;
        }
      } else {
        System.out.println("The chosen fellow is dead. Why can't you let him rest in pieces?");
      }
    } else {
      System.out.println("This fellow cannot fight. Let him rest in piss.");
    }
    return alive;
  }
}
