import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controller implements KeyListener {

    private CarPlayer carPlayer;

    public Controller(CarPlayer carPlayer){
        this.carPlayer = carPlayer;
    }
    @Override
    public void keyTyped(KeyEvent e) {
    }
    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            carPlayer.moveToRightLane();
        }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT){
            //this.carPlayer.setX(this.carPlayer.getX() - 6);
            carPlayer.moveToLeftLane();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
