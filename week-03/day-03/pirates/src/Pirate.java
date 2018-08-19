import java.util.Random;

public class Pirate {
  int rumLevel;
  boolean alive;
  boolean passedOut;
  boolean hasParrot;
  boolean isCaptain;
  String ccaptainName;

  public Pirate() {
    rumLevel = 0;
    alive = true;
    passedOut = false;
    hasParrot = true;
    isCaptain = false;
  }

  public Pirate(String captainName) {
    this.ccaptainName = captainName;
    isCaptain = true;
    rumLevel = 0;
    alive = true;
    passedOut = false;
    hasParrot = true;
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
        int brawlRoll = random.nextInt(3);
        if (brawlRoll == 0) {
          die();
        } else if (brawlRoll == 1) {
          pirate.die();
        } else {
          passedOut = true;
          hasParrot = false;
          pirate.passedOut = true;
          pirate.hasParrot = false;
        }
      } else {
        System.out.println("The chosen fellow is dead. Why can't you let him rest in pieces?");
      }
    } else {
      System.out.println("This fellow cannot fight. Let him rest in piss.");
    }
    return alive;
  }

  public void getStatus() {
    if (alive) {
      System.out.println("Rum level: " + rumLevel);
      System.out.println("Passed out: " + passedOut);
      System.out.println("Has parrot: " + hasParrot);
    } else {
      System.out.println("This pirate has fallen. RIP");
    }
  }
}
