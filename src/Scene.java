import javax.swing.*;
import java.awt.*;

public class Scene extends JPanel {


    CarPlayer player;
    Road road;

    public Scene() {
        setLayout(null);
        setFocusable(true);
        setBackground(Color.BLACK);
        this.setBounds(0, 0, Window.WIDTH, Window.HEIGHT);

        road = new Road();
        player = new CarPlayer(Window.WIDTH / 2 - 50, Window.HEIGHT / 2, CarPlayer.playerColor.YELLOW);
        mainGameLoop();
        this.addKeyListener(new Controller(player));

    }

    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        road.paint(graphics);
        player.paint(graphics);
    }


    public void mainGameLoop(){
        new Thread(()->{
            while (true){
                this.repaint();
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                }
            }
        }
        ).start();
    }

}
