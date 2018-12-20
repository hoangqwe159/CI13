import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class GameWindow extends JFrame {
    public static boolean isUpPress;
    public static boolean isDownPress;
    public static boolean isLeftPress;
    public static boolean isRightPress;
    //boolean : co bam nut hay ko. Static: truy cap qua Gamewindow
    GameCanvas canvas;

    public GameWindow() {
        this.setSize(800, 600);
        this.setTitle("Game Touhou");
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.canvas = new GameCanvas();
        this.add(canvas);
        this.setupEventListener();

        this.setVisible(true);

    }

    private void setupEventListener() {
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_W){
                    GameWindow.isUpPress = true;
                }
                else if (e.getKeyCode() == KeyEvent.VK_S){
                    GameWindow.isDownPress = true;
                }
                else if (e.getKeyCode() == KeyEvent.VK_A){
                    GameWindow.isLeftPress = true;
                }
                else if (e.getKeyCode() == KeyEvent.VK_D){
                    GameWindow.isRightPress = true;
                }



            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_W){
                    GameWindow.isUpPress = false;
                }
                else if (e.getKeyCode() == KeyEvent.VK_S){
                    GameWindow.isDownPress = false;
                }
                if (e.getKeyCode() == KeyEvent.VK_D){
                    GameWindow.isRightPress = false;
                }
                if (e.getKeyCode() == KeyEvent.VK_A){
                    GameWindow.isLeftPress = false;
                }
            }
        });
    }
}
/*
game window
    game canvas
        background run + render
        player run + render
        run() vong lap (game loop)
              logic cua game
        paint() render (ve ra doi tuong game)

OOP tach class + dong doi => de sua code.

non static phai tao object moi goi dc
static dung dc luon

dong doi
Dan ban Enemy => Enemy chiu don
=> func chiu don o trong Dan.

Player di chuyen [theo 4 phim]
4 phim get event tu nguoi dung
get event xu ly o game Window

BTVN
Thay 2D vao Background
Gioi han di chuyen vao run va player.
*/

