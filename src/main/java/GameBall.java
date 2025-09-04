import java.awt.*;

/**
 * A simple ball "actor" that bounces up and down.
 */
public class GameBall {
    // The height the ball should currently be rendered at
    private int height = 100;
    // The current speed of the ball, in the y direction
    private int yVelocity = -3;
    private int xPos = 200;

    public GameBall() {}

    /**
     * What the ball should do each frame
     */
    public void act(boolean spaceDown) {
        height += yVelocity;
        // Make the ball bounce
        if (height < 0 || height > 390) {
            yVelocity *= -1;
        }
        if (spaceDown) {
            xPos += 1;
        }
    }

    public int getHeight() {
        return height;
    }

    public void paint(Graphics g) {
        g.fillOval(xPos, this.getHeight(), 10,10);
    }
}
