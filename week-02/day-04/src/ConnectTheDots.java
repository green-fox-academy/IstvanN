import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
  public static void mainDraw(Graphics graphics) {
    
    int[][] newArray = {{10, 10}, {290,  10}, {290, 290}, {10, 290}};
    int[][] surprise = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};
    connectDots(newArray, graphics);
    connectDots(surprise, graphics);

  }

  public static void connectDots(int[][] arrayInput, Graphics graphics) {

    graphics.setColor(Color.green);
    int[] theXs = new int[arrayInput.length];
    int[] theYs = new int[arrayInput.length];

    for (int i = 0; i < arrayInput.length; i++) {
      for (int j = 0; j < 2; j++) {
        if (j == 0) {
          theXs[i] = arrayInput[i][j];
        } else {
          theYs[i] = arrayInput[i][j];
        }
      }
    }

    graphics.drawPolygon(theXs, theYs, arrayInput.length);
  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
