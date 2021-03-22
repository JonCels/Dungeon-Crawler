package GameInfo;
import java.util.LinkedList;
import java.awt.Graphics;

public class Handler {
    public LinkedList<GameObject> objects = new LinkedList<GameObject>();

    public void addObject(GameObject object) {
        this.objects.add(object);
    }

    public void removeObject(GameObject object) {
        this.objects.remove(object);
    }

    public void tick() {
        for (int i = 0; i < objects.size(); i++) {
            GameObject temp = objects.get(i);

            temp.tick();
        }
    }

    public void render(Graphics g) {
        for (int i = 0; i < objects.size(); i++) {
            GameObject temp = objects.get(i);

            temp.render(g);
        }
    }

    
}
