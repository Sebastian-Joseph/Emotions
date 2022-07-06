
import javax.swing.JPanel;
import java.awt.*;

public class GamePanel extends JPanel {

    private MouseInputs mouseInputs;
    private float xDelta = 100, yDelta = 100;
    private float xDir = 1f, yDir = 1f;


    public GamePanel() {

        mouseInputs = new MouseInputs(GamePanel.this);
        addKeyListener(new KeyboardInputs(GamePanel.this));
        addMouseListener(new MouseInputs(GamePanel.this));

    }

    public void changeXDelta(int value) {
        this.xDelta += value;
    }

    public void changeYDelta(int value) {
        this.yDelta += value;
    }



    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        updateRectangle();
        g.fillRect((int)xDelta, (int)yDelta, 200, 50);


        }




    public void updateRectangle() {
        xDelta += xDir;
        if(xDelta > 400 || xDelta < 0) {
            xDir *= -1;
        }

        yDelta += yDir;
        if(yDelta > 400 || yDelta < 0) {
            yDir *= -1;
        }

    }
}
