package GameInfo;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyboardInput extends KeyAdapter{
    private Handler handler;

    public KeyboardInput(Handler handler) {
        this.handler = handler;
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        for (int i = 0; i < handler.objects.size(); i++) {
            GameObject tempObject = handler.objects.get(i);

            if (tempObject.getID() == GameID.Player) {
                //key events for player

                //w key
                if (key == KeyEvent.VK_W)
                    tempObject.setY(tempObject.getY() - 1);
            }
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
    }
}
