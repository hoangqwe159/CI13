import tklibs.SpriteUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GameCanvas extends JPanel {
    Background background;
    Player player;


    public GameCanvas() {
        this.background = new Background();
        this.player = new Player();
    }

    public void run() {
        long currentMilli = System.currentTimeMillis();
        while (true) {
            if (System.currentTimeMillis()- currentMilli >= 50/3) {

                this.background.run();
                this.player.run();

                currentMilli = System.currentTimeMillis();
                this.repaint();
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0,0,800,600);
        //g.drawImage(this.background.image,this.background.x,this.background.y,null); //background.render()
        //g.drawImage(this.player.image,this.player.x,this.player.y,null);             //player.render
        this.background.render(g);
        this.player.render(g);
    }
}
