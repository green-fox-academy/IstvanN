import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
  public static void mainDraw(Graphics graphics) {
    
    for (int j = 0; j <= HEIGHT; j += 20) {
      for (int i = 0; i <= WIDTH; i += 20) {
        lineToCenter(0, i, graphics);
        lineToCenter(WIDTH, i, graphics);
      }
      lineToCenter(j, 0, graphics);
      lineToCenter(j, HEIGHT, graphics);
    }
  }

  public static void lineToCenter(int startX, int startY, Graphics graphics) {
    graphics.drawLine(startX, startY, WIDTH / 2, HEIGHT / 2);
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
