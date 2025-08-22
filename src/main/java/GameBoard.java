import java.awt.*;
import javax.swing.*;

/** A panel that will be used to display the game board, where animations occur */
public class GameBoard extends JPanel {
  GameBall ball;

  public GameBoard() {
    super();
    this.setPreferredSize(new Dimension(400, 400));
    ball = new GameBall();
  }

  /** Function comparable to Greenfoot's "act". Will be called every frame by the GameManager. */
  public void act() {
    // You'll want to loop through entities on the board and call their "act" functions here
    // In this case it's just the ball
    ball.act();
  }

  /**
   * Re-render this board.
   *
   * @param g the <code>Graphics</code> object, used for drawing elements
   */
  @Override
  public void paintComponent(Graphics g) {
    // You'll want to loop through entities on the board and call their "paint" functions here
    // In this case it's just the ball
    ball.paint(g);
  }
}
