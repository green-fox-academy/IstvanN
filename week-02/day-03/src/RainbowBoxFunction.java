import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
  public static void mainDraw(Graphics graphics) {
    String[] colors = {"red", "orange", "yellow", "green", "blue", "purple", "magenta"};
    for (int i = colors.length - 1; i >= 0; i--) {
      rainBox((i + 1) * 40, colors[i], graphics);
    }
  }

  public static void rainBox(int size, String color, Graphics graphics) {
    color = color.toLowerCase();
    Color purple = new Color(75, 0, 130);

    if (color.equals("red")) {
      graphics.setColor(Color.red);
    } else if (color.equals("orange")) {
      graphics.setColor(Color.orange);
    } else if (color.equals("yellow")) {
      graphics.setColor(Color.orange);
    } else if (color.equals("green")) {
      graphics.setColor(Color.green);
    } else if (color.equals("blue")) {
      graphics.setColor(Color.blue);
    } else if (color.equals("purple")) {
      graphics.setColor(purple);
    } else if (color.equals("magenta")) {
      graphics.setColor(Color.magenta);
    }

    graphics.fillRect(WIDTH / 2 - size / 2, HEIGHT / 2 - size / 2, size, size);
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
