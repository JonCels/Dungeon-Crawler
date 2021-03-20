package GameInfo;
import java.awt.Graphics;

public abstract class GameObject {
    protected int x, y;
    protected GameID id;
    //protected int velX, velY;

    protected GameObject(int x, int y, GameID id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public GameID getID() {
        return this.id;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setID(GameID id) {
        this.id = id;
    }

    public abstract void tick();
    public abstract void render(Graphics g);
}
