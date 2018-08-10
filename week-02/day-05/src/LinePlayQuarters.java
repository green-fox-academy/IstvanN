import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
  public static void mainDraw(Graphics graphics) {

    for (int i = 0; i < WIDTH / 2; i += 10) {
      graphics.setColor(Color.magenta);
      graphics.drawLine(i, 0, WIDTH / 2, i );
    }

    for (int i = 0; i < HEIGHT / 2; i += 10) {
      graphics.setColor(Color.green);
      graphics.drawLine(0, i, i, HEIGHT / 2);
    }

    for (int i  = 0; i < WIDTH / 2; i += 10) {
      graphics.setColor(Color.magenta);
      graphics.drawLine(WIDTH / 2 + i, 0, WIDTH, i);
    }

    for (int i = 0; i < HEIGHT / 2; i += 10) {
      graphics.setColor(Color.green);
      graphics.drawLine(WIDTH / 2, i, WIDTH / 2 + i, HEIGHT / 2 );
    }

    for (int i = 0; i < WIDTH / 2; i += 10) {
      graphics.setColor(Color.magenta);
      graphics.drawLine(i, HEIGHT / 2, WIDTH / 2, HEIGHT / 2 + i );
    }

    for (int i = 0; i < HEIGHT / 2; i += 10) {
      graphics.setColor(Color.green);
      graphics.drawLine(0, HEIGHT / 2 + i, i, HEIGHT);
    }

    for (int i = 0; i < WIDTH / 2; i += 10) {
      graphics.setColor(Color.magenta);
      graphics.drawLine(WIDTH / 2 + i, HEIGHT / 2, WIDTH, HEIGHT / 2 + i );
    }

    for (int i = 0; i < HEIGHT / 2; i += 10) {
      graphics.setColor(Color.green);
      graphics.drawLine(WIDTH / 2, HEIGHT / 2 + i, WIDTH / 2 + i, HEIGHT);
    }
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
