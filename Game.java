import java.awt.Canvas;
import java.awt.image.BufferStrategy;
import java.awt.Graphics;
import java.awt.Color;
import Enemies.*;
import Player.*;
import Player.Equipment.*;


public class Game extends Canvas implements Runnable {
    private static final long serialVersionUID = -1442798787354930462L;
    private static final int WIDTH = 640, HEIGHT = WIDTH * 9 / 12;
    private Thread thread;
    private boolean isRunning = false;

    public Game() {
        new Window(WIDTH, HEIGHT, "Dungeon Crawler", this);
    }

    public synchronized void start() {
        thread = new Thread(this);
        thread.start();
        isRunning = true;
    }

    public synchronized void stop() {
        try {
            thread.join();
            isRunning = false;
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    /*
    * Game loop
    *
    */
    public void run() {
        long lastTime = System.nanoTime();
        double numTicks = 60.0;
        double ns = 1000000000 / numTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int frames = 0;
        while(isRunning) {
            long currTime = System.nanoTime();
            delta += (currTime - lastTime) / ns;
            lastTime = currTime;

            while (delta-- >= 1) {
                tick();
            }

            if (isRunning) 
                render();
            frames++;

            if (System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                System.out.println("FPS: " + frames);
                frames = 0;
            }
        }
    }

    private void tick() {

    }

    private void render() {
        BufferStrategy bs = this.getBufferStrategy();
        if (bs == null) {
            this.createBufferStrategy(2);
            return;
        }

        Graphics g = bs.getDrawGraphics();

        g.setColor(Color.black);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        g.dispose();
        bs.show();
    }
    public static void main(String args[]) {
        new Game();
        Enemy s1 = new Slime(1);
        Enemy z2 = new Zombie(2);
        Enemy e5 = new Elemental(5);
        Player w1 = new Warrior();

        System.out.println("Warrior HP: " + w1.currentHealth());
        System.out.println("Enemy HP: " + e5.currentHealth());
        while (w1.currentHealth() > 0 && e5.currentHealth() > 0) {
            w1.isAttacked(e5.attack(), e5.attackType());
            e5.reduceHealth(w1.attack(), w1.attackType());
        }
        System.out.println("Warrior HP: " + w1.currentHealth());
        System.out.println("Enemy HP: " + e5.currentHealth());

        Equipment helm1 = new Equipment(5, Rarity.LEGENDARY, EquipmentType.HEAD);
        for (int i = 0; i < helm1.numStats(); i++) {
            System.out.println("+" + helm1.getStatValue(i) + " " + helm1.getStatType(i));
        }
    }
}
