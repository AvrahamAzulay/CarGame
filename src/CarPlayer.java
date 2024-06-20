import javax.swing.*;

public class CarPlayer extends Car {

    public enum playerColor {YELLOW};

    public CarPlayer (int x, int y,playerColor color){
        super(x,y);
        if (color == playerColor.YELLOW) {
            setImage(new ImageIcon("res/Photo/carYello.png"));
        }
    }
    public void moveToLeftLane(){
        new Thread(()->{
            int closeLeftLane = (super.getX() == Road.rightLane ? Road.centerLane : Road.leftLane);
            while (super.getX() > closeLeftLane){
                super.setX(super.getX()-1);
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
    public void moveToRightLane(){
        new Thread(()->{
            int closeLeftLane = (super.getX() == Road.leftLane ? Road.centerLane : Road.rightLane);
            while (super.getX() < closeLeftLane){
                super.setX(super.getX()+1);
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}