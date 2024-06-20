import javax.swing.*;
import java.awt.*;

public abstract class Car {
    private int x;
    private int y;
    public static final int widthCar = 100;
    public static final int heightCar = 150;
    private ImageIcon image;

    public Car(int x, int y) {
        setX(x);
        setY(y);

    }

    @Override
    public String toString() {
        return "Car{" +
                "x=" + x +
                ", y=" + y +
                ", widthCar=" + widthCar +
                ", heightCar=" + heightCar +
                ", image=" + image +
                '}';
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }
    public void paint(Graphics graphics){
        Graphics2D g2d = (Graphics2D) graphics;
        g2d.drawImage(image.getImage(), x, y, 100, 150, null);
        g2d.dispose();
    }
}
