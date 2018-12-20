import tklibs.SpriteUtils;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Player {
    //static  String playerName = "abc";
    Background background;
    BufferedImage image;
    Vector2D position;
    static  float speed, speed_d;
    static int w_b, h_b, w_p, h_p;


    public Player() {
       // Player.playerName; // co the goi y het ben canvas
        this.speed = 5;
        this.speed_d = this.speed / (float) Math.sqrt(2);
        this.image = SpriteUtils.loadImage("assets/images/players/straight/0.png");
        this.position = new Vector2D(200, 400);
        this.w_b = background.image.getWidth();
        this.h_b = 600;
        this.w_p = this.image.getWidth();
        this.h_p = 77;

    }
    public void run() {
        if ((GameWindow.isUpPress) && !(GameWindow.isLeftPress) && !(GameWindow.isDownPress) && !(GameWindow.isRightPress)) {
            if (this.position.y < 0)
                this.position.addThis(0, 0);
            else
                this.position.addThis(0, -this.speed);
        } else if (!(GameWindow.isUpPress) && !(GameWindow.isLeftPress) && (GameWindow.isDownPress) && !(GameWindow.isRightPress)) {
            if (this.position.y > (h_b - h_p))
                this.position.addThis(0, 0);
            else
                this.position.addThis(0, this.speed);
        } else if (!(GameWindow.isUpPress) && (GameWindow.isLeftPress) && !(GameWindow.isDownPress) && !(GameWindow.isRightPress)) {
            if (this.position.x < 0)
                this.position.addThis(0, 0);
            else
                this.position.addThis(-this.speed, 0);
        } else if ((GameWindow.isUpPress) && (GameWindow.isLeftPress) && !(GameWindow.isDownPress) && !(GameWindow.isRightPress)) {
            if (this.position.y < 0 || this.position.x < 0)
                this.position.addThis(0, 0);
            else
                this.position.addThis(-this.speed_d, -this.speed_d);
        } else if ((GameWindow.isUpPress) && !(GameWindow.isLeftPress) && !(GameWindow.isDownPress) && (GameWindow.isRightPress)) {
            if (this.position.y < 0 || this.position.x > (w_b - w_p))
                this.position.addThis(0, 0);
            else
                this.position.addThis(this.speed_d, -this.speed_d);

        } else if (!(GameWindow.isUpPress) && !(GameWindow.isLeftPress) && !(GameWindow.isDownPress) && (GameWindow.isRightPress)) {
            if (this.position.x > (w_b - w_p))
                this.position.addThis(0, 0);
            else
                this.position.addThis(this.speed, 0);
        } else if (!(GameWindow.isUpPress) && (GameWindow.isLeftPress) && (GameWindow.isDownPress) && !(GameWindow.isRightPress)) {
            if (this.position.y > (h_b - h_p) || this.position.x < 0)
                this.position.addThis(0, 0);
            else
                this.position.addThis(-this.speed_d, this.speed_d);
        } else if (!(GameWindow.isUpPress) && !(GameWindow.isLeftPress) && (GameWindow.isDownPress) && (GameWindow.isRightPress)) {
            if (this.position.y > (h_b - h_p) || this.position.x > (w_b - w_p))
                this.position.addThis(0, 0);
            else
                this.position.addThis(this.speed_d, this.speed_d);
        } else
            this.position.addThis(0, 0);
    }


    //Gioi han di chuyen cho player
    //Vector 2D: diem(x, y) vector (x, y)



    public  void render(Graphics g) {
        g.drawImage(this.image,(int)this.position.x,(int)this.position.y,null);
    }
}
