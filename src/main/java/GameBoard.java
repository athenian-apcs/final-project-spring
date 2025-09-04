import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * A panel that will be used to display the game board, where animations occur
 */
public class GameBoard extends JPanel implements KeyListener {
    GameBall ball;
    private boolean spaceDown = false;

    public GameBoard() {
        super();
        this.setPreferredSize(new Dimension(400, 400));
        ball = new GameBall();
    }

    /**
     * Function comparable to Greenfoot's "act". Will be called every frame by the GameManager.
     */
    public void act() {
        // You'll want to loop through entities on the board and call their "act" functions here
        // In this case it's just the ball
        ball.act(spaceDown);
    }

    /**
     * Re-render this board.
     * @param g the <code>Graphics</code> object, used for drawing elements
     */
    @Override
    public void paintComponent(Graphics g) {
        // You'll want to loop through entities on the board and call their "paint" functions here
        // In this case it's just the ball
        ball.paint(g);
    }

    /**
     * Invoked when a key has been typed.
     * See the class description for {@link KeyEvent} for a definition of
     * a key typed event.
     *
     * @param e the event to be processed
     */
    @Override
    public void keyTyped(KeyEvent e) {

    }

    /**
     * Invoked when a key has been pressed.
     * See the class description for {@link KeyEvent} for a definition of
     * a key pressed event.
     *
     * @param e the event to be processed
     */
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            spaceDown = true;
        }
    }

    /**
     * Invoked when a key has been released.
     * See the class description for {@link KeyEvent} for a definition of
     * a key released event.
     *
     * @param e the event to be processed
     */
    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            spaceDown = false;
        }
    }
}
